package com.jk.service.reception.impl;

import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TPersonage;
import com.jk.mapper.reception.TPersonageMapper;
import com.jk.service.reception.TPersonageService;
import com.jk.util.DateUtil;
import com.jk.util.EmojiFilter;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Service
public class TPersonageServiceImpl implements TPersonageService {
    private final Base64.Encoder encoder = Base64.getEncoder();
    @Autowired
    TPersonageMapper tPersonageMapper;

    @Override
    public String insertSelective(TPersonage record) {
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss");
        int i = 0;
        String id = "";
        TPersonage recordu =  tPersonageMapper.selectByOpenId(record.getOpenid());
        if(recordu != null && StringUtil.isNotEmpty(recordu.gettId())) {
            recordu.setOpenid(record.getOpenid());
            recordu.settUpdateTime(dateNow);
            i = tPersonageMapper.updateByPrimaryKeySelective(recordu);
            id=recordu.gettId();
        } else {
            record.settId(UUIDUtil.getUUID());
            i = tPersonageMapper.insertSelective(record);
            id=record.gettId();
        }

        return id;
    }

    @Override
    public List<TPersonage> selectByExample(TPersonage record) {

        return tPersonageMapper.selectByExample(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TPersonage record) {
        int i = 0;
        try {
            if(null != record && StringUtils.isNotBlank(record.getNickname())){
                //判断是否存在表情
                boolean b = EmojiFilter.containsEmoji(record.getNickname());
                if(b){
                    byte[] textByte = record.getNickname().getBytes("UTF-8");
                    //编码
                    String encodedText = encoder.encodeToString(textByte);
                    record.setNickname(encodedText);
                }
            }
            i = tPersonageMapper.updateByPrimaryKeySelective(record);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public TPersonage selectByPrimaryKeyUser(String id) {
        return tPersonageMapper.selectByPrimaryKey(id);
    }
}
