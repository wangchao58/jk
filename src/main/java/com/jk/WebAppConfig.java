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
                        "/territory/listTerritorySele",
                        "/dept/listDeptByPort",
                        "/slideshow/listSlideshowByPort",
                        "/file/uploadFile",
                        "/file/download",
                        "/dept/selDeptByIdPort",
                        "/trecruitInfo/trecruitInfoData",
                        "/trecruitInfo/updTrecruitInfo",
                        "/activity/getActivityList",
                        "/activity/getActivityByTid",
                        "/activity/collectionActivity",
                        "/activity/activityApply",
                        "/information/getInformationList",
                        "/information/getInformationByTid"
                        );

    }
}
