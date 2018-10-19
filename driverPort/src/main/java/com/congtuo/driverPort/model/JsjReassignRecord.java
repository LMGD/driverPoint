package com.congtuo.driverPort.model;

import java.util.Date;

public class JsjReassignRecord {
    private Integer id;

    private String orderCode;

    private Integer driverId;

    private Integer addId;

    private Date addTime;

    private Integer resaaignType;

    private Integer reward;

    private String tipManager;

    private String tipDriver;

    private String exp1;

    private String exp2;

    private String exp3;

    public JsjReassignRecord(Integer id, String orderCode, Integer driverId, Integer addId, Date addTime, Integer resaaignType, Integer reward, String tipManager, String tipDriver, String exp1, String exp2, String exp3) {
        this.id = id;
        this.orderCode = orderCode;
        this.driverId = driverId;
        this.addId = addId;
        this.addTime = addTime;
        this.resaaignType = resaaignType;
        this.reward = reward;
        this.tipManager = tipManager;
        this.tipDriver = tipDriver;
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    public JsjReassignRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getResaaignType() {
        return resaaignType;
    }

    public void setResaaignType(Integer resaaignType) {
        this.resaaignType = resaaignType;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getTipManager() {
        return tipManager;
    }

    public void setTipManager(String tipManager) {
        this.tipManager = tipManager;
    }

    public String getTipDriver() {
        return tipDriver;
    }

    public void setTipDriver(String tipDriver) {
        this.tipDriver = tipDriver;
    }

    public String getExp1() {
        return exp1;
    }

    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }

    public String getExp2() {
        return exp2;
    }

    public void setExp2(String exp2) {
        this.exp2 = exp2;
    }

    public String getExp3() {
        return exp3;
    }

    public void setExp3(String exp3) {
        this.exp3 = exp3;
    }
}