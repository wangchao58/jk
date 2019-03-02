package com.jk.controller.evaluate;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TEvaluate;
import com.jk.service.evaluate.EvaluateServicr;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.*;

@Controller
@RequestMapping("/evaluate")
public class EvaluateController {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    EvaluateServicr evaluateServicr;

    /**
     * 资讯评论（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/addEvaluate")
    @ResponseBody
    public int addEvaluate(TEvaluate tEvaluate){
        return evaluateServicr.addEvaluate(tEvaluate);
    }

    /**
     * 查询资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/selTEvaluateList")
    @ResponseBody
    public List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate){
        return evaluateServicr.selTEvaluateList(tEvaluate);
    }

    /**
     * 查询我的评论资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/selTEvaluateListByPort")
    @ResponseBody
    public Map<String,Object> selTEvaluateListByPort(TEvaluate tEvaluate, int rows) throws UnsupportedEncodingException {
        List<Map<String,Object>> evaluates = new ArrayList<>();
        Map<String,Object> maps = new HashMap<>();
        PageHelper.startPage(tEvaluate.getPage(),rows);//分页查询
        List<Map<String,Object>> listEvaluate = evaluateServicr.selTEvaluateListByPort(tEvaluate);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(listEvaluate);
        for (Map<String, Object> stringObjectMap : listEvaluate) {
            String tContent = (String) stringObjectMap.get("t_content");
            if(StringUtils.isNotBlank(tContent)){
                // 判断时候Base64编码
                Boolean isLegal = tContent.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String tContentData = new String(decoder.decode(tContent), "UTF-8");
                    stringObjectMap.put("t_content", tContentData);
                }
            }
            evaluates.add(stringObjectMap);
        }
        maps.put("listEvaluate", evaluates);
        maps.put("pages", pageInfo.getPages());
        return maps;
    }

    /**
     * 评论总数
     * @param tEvaluate
     * @return
     */
    @RequestMapping("/totalEvaluate")
    @ResponseBody
    public Map<String,Object> totalEvaluate(TEvaluate tEvaluate){
        Map<String,Object> maps = new HashMap<>();
        List<Map<String,Object>> listEvaluate = evaluateServicr.selTEvaluateListByPort(tEvaluate);
        maps.put("totalEvaluate", listEvaluate.size());
        return maps;
    }


}
