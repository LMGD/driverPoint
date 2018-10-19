package com.congtuo.driverPort.model;

public class jsjOrderWithBLOBs extends jsjOrder {
    private String tipManager;

    private String tipDriver;

    private String tipPassenger;

    public jsjOrderWithBLOBs(String orderCode, String name, String mobile, String orderName, String orderMobile, Date addTime, Date useTime, Integer productId, Integer carTypeId, Integer sourceId, Integer orderType, String thirdCode, Float price, String flightNo, Integer driverId, String depart, String departDetail, String termini, String terminiDetail, Integer status, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date updateTime, Date delTime, Date takeTime, Date atTime, Date beginTime, Date endTime, Integer timeStatus, String cityCode, Boolean isDel, String stJw, String endJw, Integer robType, Integer forecast, Integer distance, Integer changeStatus, Boolean isArchive, String orderUuid, Integer count, Float deviationPrice, String exp4, String exp5, Byte payType, Float originalPrice, String specialServiceId, String refundNote, String refundPrice, String refundFailReason, String tipFlight, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, Integer couponUserId, BigDecimal couponAmount, Date refundTime, String tipManager, String tipDriver, String tipPassenger) {
        super(orderCode, name, mobile, orderName, orderMobile, addTime, useTime, productId, carTypeId, sourceId, orderType, thirdCode, price, flightNo, driverId, depart, departDetail, termini, terminiDetail, status, robTime, cancleId, cancleType, cancelReason, cancleTime, addType, addId, updateTime, delTime, takeTime, atTime, beginTime, endTime, timeStatus, cityCode, isDel, stJw, endJw, robType, forecast, distance, changeStatus, isArchive, orderUuid, count, deviationPrice, exp4, exp5, payType, originalPrice, specialServiceId, refundNote, refundPrice, refundFailReason, tipFlight, vip, introducer, introducerType, introducerIsVal, couponUserId, couponAmount, refundTime);
        this.tipManager = tipManager;
        this.tipDriver = tipDriver;
        this.tipPassenger = tipPassenger;
    }

    public jsjOrderWithBLOBs() {
        super();
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

    public String getTipPassenger() {
        return tipPassenger;
    }

    public void setTipPassenger(String tipPassenger) {
        this.tipPassenger = tipPassenger;
    }
}