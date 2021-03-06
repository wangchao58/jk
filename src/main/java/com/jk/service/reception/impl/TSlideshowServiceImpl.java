package com.jk.service.reception.impl;

import com.jk.entity.reception.TSlideshow;
import com.jk.mapper.reception.TSlideshowMapper;
import com.jk.service.reception.TSlideshowService;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TSlideshowServiceImpl implements TSlideshowService {

    @Autowired
    TSlideshowMapper tSlideshowMapper;

    @Override
    public int deleteByPrimaryKey(List<String> ids) {
        return tSlideshowMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public int insertSelective(TSlideshow record) {
        record.setId(UUIDUtil.getUUID());
        record.setCreateTime(new Date());
        return tSlideshowMapper.insertSelective(record);
    }

    @Override
    public List<TSlideshow> selectByExample(TSlideshow record) {
        return tSlideshowMapper.selectByExample(record);
    }

    @Override
    public List<TSlideshow> selectByExampleByTime() {
        return tSlideshowMapper.selectByExampleByTime();
    }

    @Override
    public TSlideshow selectByPrimaryKey(String id) {
        return tSlideshowMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSlideshow record) {
        return tSlideshowMapper.updateByPrimaryKeySelective(record);
    }
}
