package com.jk.controller.store;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.entity.jurisdiction.TUser;
import com.jk.entity.reception.TStore;
import com.jk.service.store.TStoreService;
import com.jk.util.ItemSortUtil;
import com.jk.util.JsonUtil;
import com.jk.util.MapHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 店铺管理
 * 王超
 */
@Controller
@RequestMapping(value = "/store")
public class TStoreController  {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    TStoreService tStoreService;


    /**
     * 进入店铺管理列表页面
     * @return
     */
    @RequestMapping(value = "/listStoreView")
    public String listMenuView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/store/storeList";
    }


    /**
     * 进入增加店铺页面
     * @return
     */
    @RequestMapping(value = "/addStoreView")
    public String addStoreView() {
        return "html/reception/store/storeadd";
    }


    /**
     * 删除店铺管理发布的信息
     * @param ids
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(String ids) {
        int i = tStoreService.deleteByPrimaryKey(ids);
        return i;
    }

    /**
     * 增加店铺管理发布的信息(接口)
     * @param record
     * @return
     */
    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(TStore record,String [] region) {
        record.setProvince(region[0]);
        record.setCity(region[1]);
        record.setDistrict(region[2]);
        int i = tStoreService.insertSelective(record);
        return i;
    }

    /**
     * 功能：店铺列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public String selectByExample(TStore record, int rows, HttpServletRequest request) {
        List<TStore> tStoreDataList = new ArrayList<>();
        List<TStore> tStoreList = null;
        PageInfo<TStore> pageInfo = null;
        try {
            // 子账号查询自己录入的商铺
            TUser user = (TUser) request.getSession().getAttribute("user");
            if(null != user && !StringUtils.equals("admin", user.getUserName())){
                record.settEntry(user.getUserId());
            }

            PageHelper.startPage(record.getPage(),rows);//分页查询
            tStoreList = tStoreService.selTStoreList(record);
            pageInfo = new PageInfo<>(tStoreList);
            for (TStore tStore : tStoreList) {
                String tExplain = tStore.gettExplain();
                // 判断时候Base64编码
                Boolean isLegal = tExplain.matches(base64Pattern);
                if (isLegal) {
                    //解码
                    String tExplainData = new String(decoder.decode(tExplain), "UTF-8");
                    tStore.settExplain(tExplainData);
                }
                tStoreDataList.add(tStore);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        record.setPageSize(rows);
        record.setRows(tStoreDataList);
        record.setPage(record.getPage());
        record.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(record);
    }

    /**
     * 功能：接口店铺列表
     * 作者：transcend
     * @param record
     * @param rows
     * @return
     */
    @RequestMapping(value = "/selectByExampleByPort")
    @ResponseBody
    public Map<String,Object> selectByExampleByPort(TStore record, int rows) {
        List<TStore> tStoreDataList = new ArrayList<>();
        Map<String,Object> maps = new HashMap<>();
//        PageInfo<TStore> pageInfo = null;
        try {
//            PageHelper.startPage(record.getPage(),rows);//分页查询
            List<TStore> tStoreList =  tStoreService.selectByExample(record);
//            pageInfo = new PageInfo<>(tStoreList);
            for (TStore tStore : tStoreList) {
                String tExplain = tStore.gettExplain();
                if(StringUtils.isNotBlank(tExplain)){
                    // 判断时候Base64编码
                    Boolean isLegal = tExplain.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String tExplainData = new String(decoder.decode(tExplain), "UTF-8");
                        tStore.settExplain(tExplainData);
                    }
                }
                tStoreDataList.add(tStore);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //用户所在位置坐标（纬度，经度）
        String coordinate = record.getLatitude()+","+record.getLongitude();
        if(StringUtils.isNotBlank(record.getLatitude()) && StringUtils.isNotBlank(record.getLongitude())){
            //根据地址坐标计算距离
            List<TStore> tStoreList = computeDistance(coordinate, tStoreDataList);
            //根据距离排序
            tStoreDataList = ItemSortUtil.getDistanceAndResidueSeat(tStoreList);
        }
        maps.put("tStoreList",tStoreDataList);
//        maps.put("pages",pageInfo.getPages());
        return maps;
    }

    /**
     * 功能：查询一条
     * 作者：transcend
     * @param record
     * @param enshrineViews 浏览次数计数标识“true”不增加计数
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public TStore selectByPimaryKey(TStore record, String enshrineViews) {
        TStore tStore = tStoreService.selTStore(record, enshrineViews);
        return tStore;
    }

    /**
     * 功能：修改
     * 作者：transcend
     * @param record
     * @return
     */
    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreService.updateByPrimaryKeySelective(record);
        return i;
    }

    /**
     * 店铺添加（后台）
     * @param record
     * @return
     */
    @RequestMapping(value = "/addTStore")
    @ResponseBody
    public int addTStore(TStore record, HttpServletRequest request) {
        record.settPicture("https://i.bjjkkj.com/file/download?fileName="+record.gettPicture());
        TUser user = (TUser) request.getSession().getAttribute("user");
        record.settIssuer(user.getUserId());
        record.settEntry(user.getUserId());
        return tStoreService.insertSelective(record);
    }

    /**
     * 根据地址坐标计算距离
     * @return
     */
    public List<TStore> computeDistance(String coordinate, List<TStore> tStoreList){
        List<TStore> tStores = new ArrayList<>();
        if(tStoreList.size()>0){
            for (TStore tStore : tStoreList) {
                String longitude = tStore.getLongitude();
                String latitude = tStore.getLatitude();
                if(StringUtils.isNotBlank(longitude) && StringUtils.isNotBlank(latitude) && StringUtils.isNotBlank(coordinate)){
                    String distanceData = latitude+","+longitude;
                    double distance = MapHelper.GetPointDistance(coordinate, distanceData);
                    Double format = Double.parseDouble(String.format("%.1f", distance));
                    tStore.setDistance(format);
                    tStores.add(tStore);
                }
            }
        }
        return tStores;
    }

    /**
     * 后台编辑商铺信息查询数据
     * @param tId
     * @return
     */
    @RequestMapping("/getTStore")
    public String getTStore(String tId, Model model){
        TStore tStore = tStoreService.getTStore(tId);
        model.addAttribute("tStore",tStore);
        return "html/reception/store/storeupd";
    }
}
