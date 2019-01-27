package com.jk.entity.reception;

import com.jk.util.Page;

public class TEvaluate extends Page {
    private String tId;

    private String pId;

    private String tOtherId;

    private String tContent;

    private String createTime;

    private String tPicture;

    private String tAnonymity;

    private String tType;

    private String avatar; //微信头像

    private String nickName; //微信昵称

    private String fId; //微信昵称

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String gettOtherId() {
        return tOtherId;
    }

    public void settOtherId(String tOtherId) {
        this.tOtherId = tOtherId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String gettPicture() {
        return tPicture;
    }

    public void settPicture(String tPicture) {
        this.tPicture = tPicture;
    }

    public String gettAnonymity() {
        return tAnonymity;
    }

    public void settAnonymity(String tAnonymity) {
        this.tAnonymity = tAnonymity;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }
}