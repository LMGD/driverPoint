package com.congtuo.driverPort.model;

public class bcOrderWithBLOBs extends bcOrder {
    private String tipManager;

    private String tipPassenger;

    private String tipDriver;

    public bcOrderWithBLOBs(String orderCode, String name, String mobile, Date addTime, Date useTime, Double useDays, Integer productId, Integer carTypeId, Integer sourceId, String thirdCode, Float price, Integer driverId, String depart, String departDetail, Integer status, Integer auditingStatus, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date delTime, String cityCode, String terminiCity, Boolean isDel, String stJw, Integer robType, Boolean isArchive, String orderUuid, Float deviationPrice, Byte payType, Float originalPrice, String refundNote, String refundPrice, String refundFailReason, String extraPrice, Boolean extraType, String extraOrderid, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, Integer couponUserId, BigDecimal couponAmount, Integer extraDriverPrice, Date refundTime, String tipManager, String tipPassenger, String tipDriver) {
        super(orderCode, name, mobile, addTime, useTime, useDays, productId, carTypeId, sourceId, thirdCode, price, driverId, depart, departDetail, status, auditingStatus, robTime, cancleId, cancleType, cancelReason, cancleTime, addType, addId, delTime, cityCode, terminiCity, isDel, stJw, robType, isArchive, orderUuid, deviationPrice, payType, originalPrice, refundNote, refundPrice, refundFailReason, extraPrice, extraType, extraOrderid, vip, introducer, introducerType, introducerIsVal, couponUserId, couponAmount, extraDriverPrice, refundTime);
        this.tipManager = tipManager;
        this.tipPassenger = tipPassenger;
        this.tipDriver = tipDriver;
    }

    public bcOrderWithBLOBs() {
        super();
    }

    public String getTipManager() {
        return tipManager;
    }

    public void setTipManager(String tipManager) {
        this.tipManager = tipManager;
    }

    public String getTipPassenger() {
        return tipPassenger;
    }

    public void setTipPassenger(String tipPassenger) {
        this.tipPassenger = tipPassenger;
    }

    public String getTipDriver() {
        return tipDriver;
    }

    public void setTipDriver(String tipDriver) {
        this.tipDriver = tipDriver;
    }
}