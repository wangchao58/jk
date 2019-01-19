package com.jk.entity.reception;

import com.jk.util.Page;

import java.util.Date;

public class TCarGroup extends Page {
    private String tId;

    private String tGroupName;

    private String tSort;

    private String tGroupLord;

    private String tGroupCode;

    private String tCreateTime;

    private String tAttribution;

    private String tClaim;

    private String tIntroduction;

    private String tExplain;

    private String tPayment;

    private Float tMoney;

    private Integer tViewsNum;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettGroupName() {
        return tGroupName;
    }

    public void settGroupName(String tGroupName) {
        this.tGroupName = tGroupName;
    }

    public String gettSort() {
        return tSort;
    }

    public void settSort(String tSort) {
        this.tSort = tSort;
    }

    public String gettGroupLord() {
        return tGroupLord;
    }

    public void settGroupLord(String tGroupLord) {
        this.tGroupLord = tGroupLord;
    }

    public String gettGroupCode() {
        return tGroupCode;
    }

    public void settGroupCode(String tGroupCode) {
        this.tGroupCode = tGroupCode;
    }

    public String gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(String tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public String gettAttribution() {
        return tAttribution;
    }

    public void settAttribution(String tAttribution) {
        this.tAttribution = tAttribution;
    }

    public String gettClaim() {
        return tClaim;
    }

    public void settClaim(String tClaim) {
        this.tClaim = tClaim;
    }

    public String gettIntroduction() {
        return tIntroduction;
    }

    public void settIntroduction(String tIntroduction) {
        this.tIntroduction = tIntroduction;
    }

    public String gettExplain() {
        return tExplain;
    }

    public void settExplain(String tExplain) {
        this.tExplain = tExplain;
    }

    public String gettPayment() {
        return tPayment;
    }

    public void settPayment(String tPayment) {
        this.tPayment = tPayment;
    }

    public Float gettMoney() {
        return tMoney;
    }

    public void settMoney(Float tMoney) {
        this.tMoney = tMoney;
    }

    public Integer gettViewsNum() {
        return tViewsNum;
    }

    public void settViewsNum(Integer tViewsNum) {
        this.tViewsNum = tViewsNum;
    }
}