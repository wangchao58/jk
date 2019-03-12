package com.jk.controller.praise;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TPraise;
import com.jk.service.praise.PraiseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 点赞
 */
@Controller
@RequestMapping("/praise")
public class PraiseController {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    PraiseService praiseService;

    /**
     * 资讯点赞（接口）
     * @param tPraise
     * @return
     */
    @RequestMapping("/addPraise")
    @ResponseBody
    public int addPraise(TPraise tPraise){
        return praiseService.addPraise(tPraise);
    }


    @RequestMapping("/listPraise")
    @ResponseBody
    public Map<String,Object>  listPraise(TPraise tPraise, int rows) throws UnsupportedEncodingException {
        List<Map<String,Object>> tPraises = new ArrayList<>();
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(tPraise.getPage(),rows);//分页查询
        List<Map<String,Object>> tPraiseList = praiseService.listPraise(tPraise);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(tPraiseList);

        for (Map<String, Object> stringObjectMap : tPraiseList) {
            String tContent = (String) stringObjectMap.get("t_content");
            String nickName = (String) stringObjectMap.get("nickName");
            // 微信名称
            if(StringUtils.isNotBlank(nickName)){
                // 判断微信名称是否Base64编码
                Boolean isLegal = nickName.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String nicknameData = new String(decoder.decode(nickName), "UTF-8");
                    stringObjectMap.put("nickName", nicknameData);
                }
            }
            if(StringUtils.isNotBlank(tContent)){
                // 判断时候Base64编码
                Boolean isLegal = tContent.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String tContentData = new String(decoder.decode(tContent), "UTF-8");
                    stringObjectMap.put("t_content", tContentData);
                }
            }
            tPraises.add(stringObjectMap);
        }
        maps.put("tPraiseList", tPraises);
        maps.put("pages", pageInfo.getPages());
        return maps;
    }

    /**
     * 点赞总数
     * @param tPraise
     * @return
     */
    @RequestMapping("/totalPraise")
    @ResponseBody
    public Map<String,Object> totalPraise(TPraise tPraise){
        Map<String,Object> maps = new HashMap<>();
        List<Map<String,Object>> tPraiseList = praiseService.listPraise(tPraise);
        maps.put("tPraiseTotal", tPraiseList.size());
        return maps;
    }
}
