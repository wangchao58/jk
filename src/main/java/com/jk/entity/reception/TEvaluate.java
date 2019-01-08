package com.jk.entity.reception;

import java.util.Date;

public class TEvaluate {
    private String tId;

    private String tUserid;

    private String tOtherId;

    private String tContent;

    private Date createTime;

    private String tPicture;

    private String tAnonymity;

    private String tType;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid;
    }

    public String gettOtherId() {
        return tOtherId;
    }

    public void settOtherId(String tOtherId) {
        this.tOtherId = tOtherId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String gettPicture() {
        return tPicture;
    }

    public void settPicture(String tPicture) {
        this.tPicture = tPicture;
    }

    public String gettAnonymity() {
        return tAnonymity;
    }

    public void settAnonymity(String tAnonymity) {
        this.tAnonymity = tAnonymity;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }
}