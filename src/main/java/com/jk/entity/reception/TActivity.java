package com.jk.entity.reception;

import com.jk.util.Page;

import java.util.Date;

public class TActivity extends Page {
    private String tId;

    private String tHeadline;

    private String tContent;

    private Date tStartTime;

    private Date tEndTime;

    private Date tCreateTime;

    private String tSite;

    private String tCharge;

    private String pId;

    private String tPhone;

    private String tWeixing;

    private Integer tPerNum;

    private Integer tApplyNum;

    private Integer tViewsNum;

    private Integer tCollectionNum;

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

    public Date gettStartTime() {
        return tStartTime;
    }

    public void settStartTime(Date tStartTime) {
        this.tStartTime = tStartTime;
    }

    public Date gettEndTime() {
        return tEndTime;
    }

    public void settEndTime(Date tEndTime) {
        this.tEndTime = tEndTime;
    }

    public Date gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
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

    public Integer gettPerNum() {
        return tPerNum;
    }

    public void settPerNum(Integer tPerNum) {
        this.tPerNum = tPerNum;
    }

    public Integer gettApplyNum() {
        return tApplyNum;
    }

    public void settApplyNum(Integer tApplyNum) {
        this.tApplyNum = tApplyNum;
    }

    public Integer gettViewsNum() {
        return tViewsNum;
    }

    public void settViewsNum(Integer tViewsNum) {
        this.tViewsNum = tViewsNum;
    }

    public Integer gettCollectionNum() {
        return tCollectionNum;
    }

    public void settCollectionNum(Integer tCollectionNum) {
        this.tCollectionNum = tCollectionNum;
    }
}