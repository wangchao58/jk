package com.jk.entity.reception;

import com.jk.util.Page;

public class TComplain extends Page {
    private String tId;

    private String userId;

    private String concate;

    private String createTime;

    private String avatarurl;

    private String nickname;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConcate() {
        return concate;
    }

    public void setConcate(String concate) {
        this.concate = concate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}