package com.jk.mapper.reception;


import com.jk.entity.reception.TSlideshow;

import java.util.List;

public interface TSlideshowMapper {
    int insert(TSlideshow record);

    int deleteByPrimaryKey(List<String> ids);

    int insertSelective(TSlideshow record);

    List<TSlideshow> selectByExample(TSlideshow record);

    List<TSlideshow> selectByExampleByTime();

    TSlideshow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TSlideshow record);

    int updateByPrimaryKey(TSlideshow record);
}