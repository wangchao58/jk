package com.jk.entity.reception;

import com.jk.util.Page;

public class TActivity extends Page {
    private String tId;

    private String tHeadline;

    private String tContent;

    private String tTime;

    private String tSite;

    private String tCharge;

    private String pId;

    private String tPhone;

    private String tWeixing;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettHeadline() {
        return tHeadline;
    }

    public void settHeadline(String tHeadline) {
        this.tHeadline = tHeadline;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public String gettSite() {
        return tSite;
    }

    public void settSite(String tSite) {
        this.tSite = tSite;
    }

    public String gettCharge() {
        return tCharge;
    }

    public void settCharge(String tCharge) {
        this.tCharge = tCharge;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
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