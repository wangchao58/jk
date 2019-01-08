package com.jk.entity.reception;

import com.jk.util.Page;

import java.util.Date;

public class TInformation extends Page {
    private String tId;

    private String tContent;

    private String tImg;

    private String tCoordinate;

    private Integer tPraise;

    private String pId;

    private Date tCreateTime;

    private Integer tViewsNum;

    private Integer tCollectionNum;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public String gettImg() {
        return tImg;
    }

    public void settImg(String tImg) {
        this.tImg = tImg;
    }

    public String gettCoordinate() {
        return tCoordinate;
    }

    public void settCoordinate(String tCoordinate) {
        this.tCoordinate = tCoordinate;
    }

    public Integer gettPraise() {
        return tPraise;
    }

    public void settPraise(Integer tPraise) {
        this.tPraise = tPraise;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Date gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
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