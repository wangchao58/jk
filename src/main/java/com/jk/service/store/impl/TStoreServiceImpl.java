package com.jk.service.store.impl;

import com.github.pagehelper.StringUtil;
import com.jk.entity.reception.TStore;
import com.jk.mapper.reception.TEnshrineMapper;
import com.jk.mapper.reception.TStoreMapper;
import com.jk.service.store.TStoreService;
import com.jk.util.DateUtil;
import com.jk.util.EmojiFilter;
import com.jk.util.Page;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Service
public class TStoreServiceImpl implements TStoreService {
    private final Base64.Encoder encoder = Base64.getEncoder();
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";

    @Autowired
    TStoreMapper tStoreMapper;
    @Autowired
    TEnshrineMapper tEnshrineMapper;

    @Override
    public int deleteByPrimaryKey(String ids) {
        List<String> stringList = Arrays.asList(ids.split(","));
        // 删除商铺
        int i = tStoreMapper.deleteByPrimaryKey(stringList);
        // 删除商铺及相关收藏
        tEnshrineMapper.delByHid(stringList);
        return i;
    }

    @Override
    public int insertSelective(TStore record) {
        int i=0;
        try {
            String tExplain = record.gettExplain();
            //判断是否存在表情
            boolean b = EmojiFilter.containsEmoji(tExplain);
            if(b){
                byte[] textByte = tExplain.getBytes("UTF-8");
                //编码
                String encodedText = encoder.encodeToString(textByte);
                record.settExplain(encodedText);
            }

            if(StringUtil.isEmpty(record.gettId())) {
                record.settPicture("https://i.bjjkkj.com/file/download?fileName="+record.gettPicture());
                record.settId(UUIDUtil.getUUID());
                record.settCreateTime(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
                i = tStoreMapper.insertSelective(record);
            } else {
                i = tStoreMapper.updateByPrimaryKeySelective(record);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return i;
    }

    /**
     * 手机端店铺查询
     * @param example
     * @return
     */
    @Override
    public List<TStore> selectByExample(TStore example) {

        //String district = example.getDistrict();
        String city = example.getCity();
        String province = example.getProvince();
        example.setCity("");
        example.setProvince("");
        List<TStore> tStoreList = tStoreMapper.selectByExample(example);

        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity(city);
            tStoreList = tStoreMapper.selectByExample(example);
        }
        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity("");
            example.setProvince(province);
            tStoreList = tStoreMapper.selectByExample(example);
        }
        if(tStoreList.size()==0) {
            example.setDistrict("");
            example.setCity("");
            example.setProvince("");
            tStoreList = tStoreMapper.selectByExample(example);
        }
        return tStoreList;
    }

    /**
     * 后台店铺查询
     * @param example
     * @return
     */
    @Override
    public List<TStore> selTStoreList(TStore example) {
        if(StringUtils.equals("请选择省份",example.getProvince())){
            example.setProvince("");
        }
        if(StringUtils.equals("请选择城市",example.getCity())){
            example.setCity("");
        }
        if(StringUtils.equals("请选择区县",example.getDistrict())){
            example.setDistrict("");
        }
        List<TStore> tStoreList = tStoreMapper.selTStoreList(example);
        return tStoreList;
    }

    @Override
    public TStore selectByPrimaryKey(String tId, String enshrineViews) {
        if(!StringUtils.equals("true", enshrineViews)){
            tStoreMapper.insertNiewsNum(tId);
        }
        TStore tStore = tStoreMapper.selectByPrimaryKey(tId);
        String tExplain = tStore.gettExplain();
        // 判断时候Base64编码
        try {
            Boolean isLegal = tExplain.matches(base64Pattern);
            if (isLegal) {
                //解码
                String tExplainData = new String(decoder.decode(tExplain), "UTF-8");
                tStore.settExplain(tExplainData);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return tStore;
    }

    @Override
    public int updateByPrimaryKeySelective(TStore record) {
        int i = tStoreMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    /**
     * 后台编辑商铺信息查询数据
     * @param tId
     * @return
     */
    @Override
    public TStore getTStore(String tId) {
        TStore tStore = tStoreMapper.getTStore(tId);
        return tStore;
    }
}
