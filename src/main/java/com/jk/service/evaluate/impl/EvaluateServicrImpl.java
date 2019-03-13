package com.jk.service.evaluate.impl;

import com.jk.entity.reception.TEvaluate;
import com.jk.entity.reception.TInformation;
import com.jk.entity.reception.TStore;
import com.jk.mapper.reception.TEvaluateMapper;
import com.jk.mapper.reception.TInformationMapper;
import com.jk.mapper.reception.TStoreMapper;
import com.jk.service.evaluate.EvaluateServicr;
import com.jk.util.DateUtil;
import com.jk.util.EmojiFilter;
import com.jk.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.*;

@Service
public class EvaluateServicrImpl implements EvaluateServicr {
    private final Base64.Encoder encoder = Base64.getEncoder();
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
    @Autowired
    TEvaluateMapper tEvaluateMapper;
    @Autowired
    TInformationMapper tInformationMapper;
    @Autowired
    TStoreMapper tStoreMapper;

    /**
     * 资讯评论（接口）
     * @param tEvaluate
     * @return
     */
    @Override
    public int addEvaluate(TEvaluate tEvaluate) {
        int i = 0;
        try {
            String tContent = tEvaluate.gettContent();
            if(StringUtils.isNotBlank(tContent)){
                //判断是否存在表情
                boolean b = EmojiFilter.containsEmoji(tContent);
                if(b){
                    byte[] textByte = tContent.getBytes("UTF-8");
                    //编码
                    String encodedText = encoder.encodeToString(textByte);
                    tEvaluate.settContent(encodedText);
                }
            }
            if(tEvaluate.gettType().equals("3")) {
                i = getInformation(tEvaluate);
            } else if(tEvaluate.gettType().equals("1")) {
                i = gettStore(tEvaluate);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return i;
    }

    private int getInformation(TEvaluate tEvaluate) {
        int i;
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm");
        TInformation tInformation = new TInformation();
        tInformation.settId(tEvaluate.gettOtherId());

        TInformation informationByTid = tInformationMapper.selectByPrimaryKeyByprore(tEvaluate.gettOtherId());
        tEvaluate.setfId(informationByTid.getpId());

        tEvaluate.settId(UUIDUtil.getUUID());
        tEvaluate.setCreateTime(dateNow);

        i = tEvaluateMapper.insertSelective(tEvaluate);
        if(i > 0){
            // 修改评论条数
            tInformation.settEvaluate(informationByTid.gettEvaluate()+1);
            i = tInformationMapper.updateByPrimaryKeySelective(tInformation);
        }
        return i;
    }

    private int gettStore(TEvaluate tEvaluate) {
        int i;
        String dateNow = DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm");
        TStore tStore = tStoreMapper.selectByPrimaryKey(tEvaluate.gettOtherId());
        tEvaluate.setfId(tStore.gettIssuer());
        tEvaluate.settId(UUIDUtil.getUUID());
        tEvaluate.setCreateTime(dateNow);
        i = tEvaluateMapper.insertSelective(tEvaluate);
        return i;
    }

    /**
     * 查询资讯评论信息（接口）
     * @param tEvaluate
     * @return
     */
    @Override
    public List<TEvaluate> selTEvaluateList(TEvaluate tEvaluate) {
        List<TEvaluate> evaluateList = new ArrayList<>();
        try {
            List<TEvaluate> tEvaluates = tEvaluateMapper.selectByExample(tEvaluate);
            for (TEvaluate evaluate : tEvaluates) {
                String createTime = evaluate.getCreateTime().substring(0,16);
                evaluate.setCreateTime(createTime);

                // 微信名称
                String nickname = evaluate.getNickName();
                if(StringUtils.isNotBlank(nickname)){
                    // 判断微信名称是否Base64编码
                    Boolean isLegal = nickname.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String nicknameData = new String(decoder.decode(nickname), "UTF-8");
                        evaluate.setNickName(nicknameData);
                    }
                }
                // 评论内容
                String tContent = evaluate.gettContent();
                if(StringUtils.isNotBlank(tContent)){
                    // 判断微信名称是否Base64编码
                    Boolean isLegal = tContent.matches(base64Pattern);
                    if (isLegal) {
                        //解码
                        String tContentData = new String(decoder.decode(tContent), "UTF-8");
                        evaluate.settContent(tContentData);
                    }
                }
                evaluateList.add(evaluate);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return evaluateList;
    }

    @Override
    public List<Map<String, Object>> selTEvaluateListByPort(TEvaluate tEvaluate) {
        List<Map<String, Object>> tEvaluatesByMap = tEvaluateMapper.selTEvaluateListByPort(tEvaluate);
        return tEvaluatesByMap;
    }
}
