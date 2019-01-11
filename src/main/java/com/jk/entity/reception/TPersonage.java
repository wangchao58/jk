package com.jk.entity.reception;

import com.jk.util.Page;

public class TPersonage extends Page {
    private String tId;

    private String openid;

    private String avatarurl;

    private String nickname;

    private String tPhone;

    private String tCreateTime;

    private String tUpdateTime;

    private String tSex;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(String tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public String gettUpdateTime() {
        return tUpdateTime;
    }

    public void settUpdateTime(String tUpdateTime) {
        this.tUpdateTime = tUpdateTime;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }
}