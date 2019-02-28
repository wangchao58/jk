package com.jk.controller.enshrine;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.reception.TCarOwner;
import com.jk.entity.reception.TEnshrine;
import com.jk.service.enshrine.EnshrineService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.*;

@Controller
@RequestMapping("/enshrine")
public class EnshrineController {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    EnshrineService enshrineService;

    /**
     * 收藏添加（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/addEnshrine")
    @ResponseBody
    public int addEnshrine(TEnshrine tEnshrine){
        return enshrineService.addEnshrine(tEnshrine);
    }

    /**
     * 收藏数据查询（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/selEnshrineList")
    @ResponseBody
    public List<TEnshrine> selEnshrineList(TEnshrine tEnshrine){
        return enshrineService.selEnshrineList(tEnshrine);
    }
    /**
     * 收藏数据商铺与活动查询（接口）
     * @param tEnshrine
     * @return
     */
    @RequestMapping(value = "/selEnshrineListByport")
    @ResponseBody
    public Map<String,Object> selEnshrineListByport(TEnshrine tEnshrine,int rows){
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> listENshriceData = new ArrayList<>();
        PageHelper.startPage(tEnshrine.getPage(),rows);//分页查询
        List<Map<String,Object>> listENshrice = enshrineService.selEnshrineListByport(tEnshrine);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(listENshrice);

        try {
            // type:1,查询收藏店铺
            if(StringUtils.equals("1",tEnshrine.gettType()) || StringUtils.isBlank(tEnshrine.gettType())){
                for (Map<String, Object> stringObjectMap : listENshrice) {
                    String tExplain = (String) stringObjectMap.get("tExplain");
                    if(StringUtils.isNotBlank(tExplain)){
                        // 判断时候Base64编码
                        Boolean isLegal = tExplain.matches(base64Pattern);
                        if (isLegal) {
                            //解码
                            String tExplainData = new String(decoder.decode(tExplain), "UTF-8");
                            stringObjectMap.put("tExplain",tExplainData);
                        }
                    }
                    listENshriceData.add(stringObjectMap);
                }
                listENshrice = listENshriceData;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        map.put("listENshrice",listENshrice);
        map.put("pages",pageInfo.getPages());
        return map;
    }
}
