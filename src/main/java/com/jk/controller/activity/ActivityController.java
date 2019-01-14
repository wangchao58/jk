package com.jk.controller.activity;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TActivity;
import com.jk.entity.reception.TApply;
import com.jk.service.activity.ActivityService;
import com.jk.util.BaseController;
import com.jk.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
     * 进入活动编辑页面
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
     * 删除活动信息
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delActivity")
    @ResponseBody
    public int delActivity(String ids){
        List<String> idlist = Arrays.asList(ids.split(","));
        return activityService.deleteByPrimaryKey(idlist);
    }

    /**
     * 活动增加/修改（接口）
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
     * 前端获取活动列表信息（接口）
     * @param tActivity
     * @return
     */
    @RequestMapping(value = "/getActivityList")
    @ResponseBody
    public List<TActivity> getActivityList(TActivity tActivity) {
        List<TActivity> activitytList = new ArrayList<>();
        List<TActivity> tActivities = activityService.selectByExample(tActivity);
        for (TActivity activity : tActivities) {
            activity.settCreateTime(activity.gettCreateTime().substring(5,10));
            activitytList.add(activity);
        }
        return activitytList;
    }

    /**
     * 前端活动详情查看（接口）
     * @return
     */
    @RequestMapping(value = "/getActivityByTid")
    @ResponseBody
    public TActivity getActivityByTid(HttpServletRequest request, TActivity tActivity){
        TActivity activityByTid = activityService.getActivityByTid(tActivity);
        return activityByTid;
    }

    /**
     * 活动收藏（接口）
     * @param tActivity
     * @return
     */
    /*@RequestMapping(value = "/collectionActivity")
    @ResponseBody
    public int collectionActivity(TActivity tActivity){
        return activityService.collectionActivity(tActivity);
    }*/

    /**
     * 活动报名（接口）
     * @param tApply
     * @return
     */
    @RequestMapping("/activityApply")
    @ResponseBody
    public int activityApply(TApply tApply){
        return activityService.activityApply(tApply);
    }

}
