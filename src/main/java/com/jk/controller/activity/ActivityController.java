package com.jk.controller.activity;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TActivity;
import com.jk.service.activity.ActivityService;
import com.jk.util.BaseController;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * 活动相关
 */
@Controller
@RequestMapping("/activity")
public class ActivityController extends BaseController {

    @Autowired
    ActivityService activityService;

    /**
     * 进入活动列表页面
     * @param model
     * @param pid
     * @param id
     * @return
     */
    @RequestMapping(value = "/listActivityView")
    public String listActivityView(Model model, String pid, String id) {
        model.addAttribute("pid",pid);
        model.addAttribute("id",id);
        return "html/reception/activity/activitylist";
    }

    /**
     * 活动列表数据查询
     * @param tActivity
     * @param rows
     * @return
     */
    @RequestMapping(value = "/listActivity")
    @ResponseBody
    public String listActivity(TActivity tActivity, int rows) {
        PageHelper.startPage(tActivity.getPage(), rows); //分页查询
        List<TActivity> ActivitytList = activityService.selectByExample(tActivity);
        PageInfo<TActivity> pageInfo = new PageInfo<>(ActivitytList);
        tActivity.setPageSize(rows);
        tActivity.setRows(ActivitytList);
        tActivity.setPage(tActivity.getPage());
        tActivity.setTotal(pageInfo.getPages());
        return JsonUtil.toJsonString(tActivity);
    }


    /**
     * 跳转活动增加页面
     * @return
     */
    @RequestMapping(value = "/addActivityView")
    public String addActivityView() {
        return "html/reception/activity/activityadd";
    }

    /**
     * 活动增加/修改
     * @param tActivity
     * @return
     */
    @RequestMapping(value = "/addActivity")
    @ResponseBody
    public int addActivity(TActivity tActivity) {
        int i = 0;
        if (StringUtil.isEmpty(tActivity.gettId())) {
            i = activityService.insertActivity(tActivity);
        } else {
            i = activityService.updateActivity(tActivity);
        }
        return i;
    }

    /**
     * 进入修改卡券页面
     * @return
     */
    @RequestMapping(value = "/updActivityView")
    public String updActivityView(String id,Model model) {
        if(StringUtil.isNotEmpty(id)) {
            TActivity tActivity = activityService.selectByPrimaryKey(id);
            model.addAttribute("tActivity",tActivity);
        }
        return "html/reception/activity/activityupd";
    }

    /**
     * 删除卡券
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delActivity")
    @ResponseBody
    public int delActivity(String ids){
        List<String> idlist = Arrays.asList(ids.split(","));
//        int delCoupon = tCouponService.deleteByPrimaryKey(idlist);
        activityService.deleteByPrimaryKey(idlist);
        return 0;

    }
}
