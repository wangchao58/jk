package com.jk;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LitteInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/login",
                        "/user/login",
                        "/**/*.js",
                        "/**/*.jpg",
                        "/**/*.png",
                        "/**/*.gif",
                        "/**/*.css",
                        "/**/*.ts",
                        "/personage/addPersonage",
                        "/personage/updPersonage",
                        "/territory/listTerritorySele",
                        "/dept/listDeptByPort",
                        "/slideshow/listSlideshowByPort",
                        "/file/uploadFile",
                        "/file/download",
                        "/dept/selDeptByIdPort",
                        "/trecruitInfo/trecruitInfoData",
                        "/trecruitInfo/updTrecruitInfo",
                        "/activity/addActivity",
                        "/activity/getActivityList",
                        "/activity/getActivityByTid",
                        "/activity/activityApply",
                        "/information/addInformation",
                        "/information/getInformationList",
                        "/information/getInformationByTid",
                        "/praise/addPraise",
                        "/evaluate/addEvaluate",
                        "/evaluate/selTEvaluateList",
                        "/enshrine/addEnshrine",
                        "/enshrine/selEnshrineList",
                        "/share/insertSelective",
                        "/store/selectByExampleByPort",
                        "/carGroup/selectByExampleByPort",
                        "/carGroup/selectByPrimaryKey",
                        "/carGroup/insertSelective",
                        "/carOwner/selectByExampleByPort",
                        "/carOwner/selectByPrimaryKey",
                        "/carOwner/insertSelective",
                        "/praise/listPraise",
                        "/evaluate/selTEvaluateListByPort",
                        "/store/insertSelective",
                        "/store/selectByPrimaryKey"
                        );

    }
}
