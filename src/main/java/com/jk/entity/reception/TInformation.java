package com.jk.entity.reception;

import com.jk.util.Page;

import java.util.List;

public class TInformation extends Page {
    private String tId;

    private String tContent;

    private String tImg;

    private String tCoordinate;

    private Integer tPraise;

    private Integer tEvaluate;

    private String pId;

    private String tCreateTime;

    private Integer tViewsNum;

    private Integer tCollectionNum;

    private String url;

    private String avatar;

    private String praiseId;

    private String city;

    private List<String> listImg;

    private String praiseImage;

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

    public Integer gettEvaluate() {
        return tEvaluate;
    }

    public void settEvaluate(Integer tEvaluate) {
        this.tEvaluate = tEvaluate;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(String tCreateTime) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPraiseId() {
        return praiseId;
    }

    public void setPraiseId(String praiseId) {
        this.praiseId = praiseId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getListImg() {
        return listImg;
    }

    public void setListImg(List<String> listImg) {
        this.listImg = listImg;
    }

    public String getPraiseImage() {
        return praiseImage;
    }

    public void setPraiseImage(String praiseImage) {
        this.praiseImage = praiseImage;
    }
}