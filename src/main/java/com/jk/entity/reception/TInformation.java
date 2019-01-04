package com.jk.entity.reception;

public class TInformation {
    private String tId;

    private String tContent;

    private String tImg;

    private String tCoordinate;

    private Integer tPraise;

    private String pId;

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
}