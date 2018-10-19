package com.congtuo.driverPort.model;

import java.util.Date;

public class driverInfo {
    private Integer driverId;

    private String name;

    private String mobile;

    private String recordCode;

    private Integer cardType;

    private String cardCode;

    private String cityCode;

    private Integer fleetId;

    private Integer carId;

    private Integer companyId;

    private Integer addId;

    private Date drivingTime;

    private String drivingType;

    private Date validTimeSt;

    private Date validTimeEnd;

    private Integer status;

    private Integer addType;

    private Date addTime;

    private Date updateTime;

    private Date delTime;

    private Integer referralsId;

    private Integer checkStatus;

    private Boolean isCheckOk;

    private Boolean isDel;

    private Integer driverType;

    private String password;

    private String bankCardNumber;

    private String branchName;

    private String bankAccountName;

    private String sex;

    private String address;

    public driverInfo(Integer driverId, String name, String mobile, String recordCode, Integer cardType, String cardCode, String cityCode, Integer fleetId, Integer carId, Integer companyId, Integer addId, Date drivingTime, String drivingType, Date validTimeSt, Date validTimeEnd, Integer status, Integer addType, Date addTime, Date updateTime, Date delTime, Integer referralsId, Integer checkStatus, Boolean isCheckOk, Boolean isDel, Integer driverType, String password, String bankCardNumber, String branchName, String bankAccountName, String sex, String address) {
        this.driverId = driverId;
        this.name = name;
        this.mobile = mobile;
        this.recordCode = recordCode;
        this.cardType = cardType;
        this.cardCode = cardCode;
        this.cityCode = cityCode;
        this.fleetId = fleetId;
        this.carId = carId;
        this.companyId = companyId;
        this.addId = addId;
        this.drivingTime = drivingTime;
        this.drivingType = drivingType;
        this.validTimeSt = validTimeSt;
        this.validTimeEnd = validTimeEnd;
        this.status = status;
        this.addType = addType;
        this.addTime = addTime;
        this.updateTime = updateTime;
        this.delTime = delTime;
        this.referralsId = referralsId;
        this.checkStatus = checkStatus;
        this.isCheckOk = isCheckOk;
        this.isDel = isDel;
        this.driverType = driverType;
        this.password = password;
        this.bankCardNumber = bankCardNumber;
        this.branchName = branchName;
        this.bankAccountName = bankAccountName;
        this.sex = sex;
        this.address = address;
    }

    public driverInfo() {
        super();
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getFleetId() {
        return fleetId;
    }

    public void setFleetId(Integer fleetId) {
        this.fleetId = fleetId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public Date getDrivingTime() {
        return drivingTime;
    }

    public void setDrivingTime(Date drivingTime) {
        this.drivingTime = drivingTime;
    }

    public String getDrivingType() {
        return drivingType;
    }

    public void setDrivingType(String drivingType) {
        this.drivingType = drivingType;
    }

    public Date getValidTimeSt() {
        return validTimeSt;
    }

    public void setValidTimeSt(Date validTimeSt) {
        this.validTimeSt = validTimeSt;
    }

    public Date getValidTimeEnd() {
        return validTimeEnd;
    }

    public void setValidTimeEnd(Date validTimeEnd) {
        this.validTimeEnd = validTimeEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAddType() {
        return addType;
    }

    public void setAddType(Integer addType) {
        this.addType = addType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public Integer getReferralsId() {
        return referralsId;
    }

    public void setReferralsId(Integer referralsId) {
        this.referralsId = referralsId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Boolean getIsCheckOk() {
        return isCheckOk;
    }

    public void setIsCheckOk(Boolean isCheckOk) {
        this.isCheckOk = isCheckOk;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getDriverType() {
        return driverType;
    }

    public void setDriverType(Integer driverType) {
        this.driverType = driverType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}