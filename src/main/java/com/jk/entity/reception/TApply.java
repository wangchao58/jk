package com.jk.entity.reception;

import java.util.Date;

public class TApply {
    private String tId;

    private String hId;

    private String pId;

    private Date tTime;

    private String tPhone;

    private String tWeixing;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Date gettTime() {
        return tTime;
    }

    public void settTime(Date tTime) {
        this.tTime = tTime;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String gettWeixing() {
        return tWeixing;
    }

    public void settWeixing(String tWeixing) {
        this.tWeixing = tWeixing;
    }
}