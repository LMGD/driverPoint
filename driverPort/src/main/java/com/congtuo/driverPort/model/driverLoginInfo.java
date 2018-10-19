package com.congtuo.driverPort.model;

import java.util.Date;

public class driverLoginInfo {
    private Integer id;

    private Integer did;

    private Integer expireTs;

    private Date addTime;

    private Date loginTime;

    private Integer version;

    private String rid;

    private String sdk;

    private String model;

    private String imel;

    public driverLoginInfo(Integer id, Integer did, Integer expireTs, Date addTime, Date loginTime, Integer version, String rid, String sdk, String model, String imel) {
        this.id = id;
        this.did = did;
        this.expireTs = expireTs;
        this.addTime = addTime;
        this.loginTime = loginTime;
        this.version = version;
        this.rid = rid;
        this.sdk = sdk;
        this.model = model;
        this.imel = imel;
    }

    public driverLoginInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getExpireTs() {
        return expireTs;
    }

    public void setExpireTs(Integer expireTs) {
        this.expireTs = expireTs;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getSdk() {
        return sdk;
    }

    public void setSdk(String sdk) {
        this.sdk = sdk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImel() {
        return imel;
    }

    public void setImel(String imel) {
        this.imel = imel;
    }
}