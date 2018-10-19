package com.congtuo.driverPort.model;

public class PcBookOrderWithBLOBs extends PcBookOrder {
    private String tipManager;

    private String tipDriver;

    private String tipPassenger;

    public PcBookOrderWithBLOBs(String orderCode, String orderUuid, String pcOrderCode, String name, String mobile, Date useTime, Float price, String depart, String departDetail, String termini, String terminiDetail, Integer driverId, Integer status, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date addTime, Date updateTime, Date delTime, Date takeTime, Date atTime, Date beginTime, Date endTime, Integer timeStatus, String cityCode, Boolean isDel, String stJw, String endJw, Integer robType, Integer forecast, Integer distance, Integer changeStatus, Boolean isArchive, Float originalPrice, Integer lugNum, Integer voteNum, String routeName, String routeSt, String routeEnd, Boolean isBale, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, String routeUuid, Integer sourceId, String refundNote, String refundPrice, String thirdCode, String refundFailReason, Byte payType, Integer couponUserId, BigDecimal couponAmount, Date refundTime, Integer orderType, String tipManager, String tipDriver, String tipPassenger) {
        super(orderCode, orderUuid, pcOrderCode, name, mobile, useTime, price, depart, departDetail, termini, terminiDetail, driverId, status, robTime, cancleId, cancleType, cancelReason, cancleTime, addType, addId, addTime, updateTime, delTime, takeTime, atTime, beginTime, endTime, timeStatus, cityCode, isDel, stJw, endJw, robType, forecast, distance, changeStatus, isArchive, originalPrice, lugNum, voteNum, routeName, routeSt, routeEnd, isBale, vip, introducer, introducerType, introducerIsVal, routeUuid, sourceId, refundNote, refundPrice, thirdCode, refundFailReason, payType, couponUserId, couponAmount, refundTime, orderType);
        this.tipManager = tipManager;
        this.tipDriver = tipDriver;
        this.tipPassenger = tipPassenger;
    }

    public PcBookOrderWithBLOBs() {
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