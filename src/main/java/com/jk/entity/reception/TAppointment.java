package com.jk.entity.reception;

import com.jk.util.Page;

public class TAppointment extends Page {
    private String tId;

    private String cId;

    private String iUserid;

    private String pNum;

    private String tPhone;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getiUserid() {
        return iUserid;
    }

    public void setiUserid(String iUserid) {
        this.iUserid = iUserid;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }
}