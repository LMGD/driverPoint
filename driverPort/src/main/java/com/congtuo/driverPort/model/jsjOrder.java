package com.congtuo.driverPort.model;

import java.math.BigDecimal;
import java.util.Date;

public class jsjOrder {
    private String orderCode;

    private String name;

    private String mobile;

    private String orderName;

    private String orderMobile;

    private Date addTime;

    private Date useTime;

    private Integer productId;

    private Integer carTypeId;

    private Integer sourceId;

    private Integer orderType;

    private String thirdCode;

    private Float price;

    private String flightNo;

    private Integer driverId;

    private String depart;

    private String departDetail;

    private String termini;

    private String terminiDetail;

    private Integer status;

    private Date robTime;

    private Integer cancleId;

    private Integer cancleType;

    private String cancelReason;

    private Date cancleTime;

    private Integer addType;

    private Integer addId;

    private Date updateTime;

    private Date delTime;

    private Date takeTime;

    private Date atTime;

    private Date beginTime;

    private Date endTime;

    private Integer timeStatus;

    private String cityCode;

    private Boolean isDel;

    private String stJw;

    private String endJw;

    private Integer robType;

    private Integer forecast;

    private Integer distance;

    private Integer changeStatus;

    private Boolean isArchive;

    private String orderUuid;

    private Integer count;

    private Float deviationPrice;

    private String exp4;

    private String exp5;

    private Byte payType;

    private Float originalPrice;

    private String specialServiceId;

    private String refundNote;

    private String refundPrice;

    private String refundFailReason;

    private String tipFlight;

    private String vip;

    private Integer introducer;

    private Byte introducerType;

    private Byte introducerIsVal;

    private Integer couponUserId;

    private BigDecimal couponAmount;

    private Date refundTime;

    public jsjOrder(String orderCode, String name, String mobile, String orderName, String orderMobile, Date addTime, Date useTime, Integer productId, Integer carTypeId, Integer sourceId, Integer orderType, String thirdCode, Float price, String flightNo, Integer driverId, String depart, String departDetail, String termini, String terminiDetail, Integer status, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date updateTime, Date delTime, Date takeTime, Date atTime, Date beginTime, Date endTime, Integer timeStatus, String cityCode, Boolean isDel, String stJw, String endJw, Integer robType, Integer forecast, Integer distance, Integer changeStatus, Boolean isArchive, String orderUuid, Integer count, Float deviationPrice, String exp4, String exp5, Byte payType, Float originalPrice, String specialServiceId, String refundNote, String refundPrice, String refundFailReason, String tipFlight, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, Integer couponUserId, BigDecimal couponAmount, Date refundTime) {
        this.orderCode = orderCode;
        this.name = name;
        this.mobile = mobile;
        this.orderName = orderName;
        this.orderMobile = orderMobile;
        this.addTime = addTime;
        this.useTime = useTime;
        this.productId = productId;
        this.carTypeId = carTypeId;
        this.sourceId = sourceId;
        this.orderType = orderType;
        this.thirdCode = thirdCode;
        this.price = price;
        this.flightNo = flightNo;
        this.driverId = driverId;
        this.depart = depart;
        this.departDetail = departDetail;
        this.termini = termini;
        this.terminiDetail = terminiDetail;
        this.status = status;
        this.robTime = robTime;
        this.cancleId = cancleId;
        this.cancleType = cancleType;
        this.cancelReason = cancelReason;
        this.cancleTime = cancleTime;
        this.addType = addType;
        this.addId = addId;
        this.updateTime = updateTime;
        this.delTime = delTime;
        this.takeTime = takeTime;
        this.atTime = atTime;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.timeStatus = timeStatus;
        this.cityCode = cityCode;
        this.isDel = isDel;
        this.stJw = stJw;
        this.endJw = endJw;
        this.robType = robType;
        this.forecast = forecast;
        this.distance = distance;
        this.changeStatus = changeStatus;
        this.isArchive = isArchive;
        this.orderUuid = orderUuid;
        this.count = count;
        this.deviationPrice = deviationPrice;
        this.exp4 = exp4;
        this.exp5 = exp5;
        this.payType = payType;
        this.originalPrice = originalPrice;
        this.specialServiceId = specialServiceId;
        this.refundNote = refundNote;
        this.refundPrice = refundPrice;
        this.refundFailReason = refundFailReason;
        this.tipFlight = tipFlight;
        this.vip = vip;
        this.introducer = introducer;
        this.introducerType = introducerType;
        this.introducerIsVal = introducerIsVal;
        this.couponUserId = couponUserId;
        this.couponAmount = couponAmount;
        this.refundTime = refundTime;
    }

    public jsjOrder() {
        super();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
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

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderMobile() {
        return orderMobile;
    }

    public void setOrderMobile(String orderMobile) {
        this.orderMobile = orderMobile;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDepartDetail() {
        return departDetail;
    }

    public void setDepartDetail(String departDetail) {
        this.departDetail = departDetail;
    }

    public String getTermini() {
        return termini;
    }

    public void setTermini(String termini) {
        this.termini = termini;
    }

    public String getTerminiDetail() {
        return terminiDetail;
    }

    public void setTerminiDetail(String terminiDetail) {
        this.terminiDetail = terminiDetail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRobTime() {
        return robTime;
    }

    public void setRobTime(Date robTime) {
        this.robTime = robTime;
    }

    public Integer getCancleId() {
        return cancleId;
    }

    public void setCancleId(Integer cancleId) {
        this.cancleId = cancleId;
    }

    public Integer getCancleType() {
        return cancleType;
    }

    public void setCancleType(Integer cancleType) {
        this.cancleType = cancleType;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Date getCancleTime() {
        return cancleTime;
    }

    public void setCancleTime(Date cancleTime) {
        this.cancleTime = cancleTime;
    }

    public Integer getAddType() {
        return addType;
    }

    public void setAddType(Integer addType) {
        this.addType = addType;
    }

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
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

    public Date getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    public Date getAtTime() {
        return atTime;
    }

    public void setAtTime(Date atTime) {
        this.atTime = atTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(Integer timeStatus) {
        this.timeStatus = timeStatus;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getStJw() {
        return stJw;
    }

    public void setStJw(String stJw) {
        this.stJw = stJw;
    }

    public String getEndJw() {
        return endJw;
    }

    public void setEndJw(String endJw) {
        this.endJw = endJw;
    }

    public Integer getRobType() {
        return robType;
    }

    public void setRobType(Integer robType) {
        this.robType = robType;
    }

    public Integer getForecast() {
        return forecast;
    }

    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Integer changeStatus) {
        this.changeStatus = changeStatus;
    }

    public Boolean getIsArchive() {
        return isArchive;
    }

    public void setIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getDeviationPrice() {
        return deviationPrice;
    }

    public void setDeviationPrice(Float deviationPrice) {
        this.deviationPrice = deviationPrice;
    }

    public String getExp4() {
        return exp4;
    }

    public void setExp4(String exp4) {
        this.exp4 = exp4;
    }

    public String getExp5() {
        return exp5;
    }

    public void setExp5(String exp5) {
        this.exp5 = exp5;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getSpecialServiceId() {
        return specialServiceId;
    }

    public void setSpecialServiceId(String specialServiceId) {
        this.specialServiceId = specialServiceId;
    }

    public String getRefundNote() {
        return refundNote;
    }

    public void setRefundNote(String refundNote) {
        this.refundNote = refundNote;
    }

    public String getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(String refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getRefundFailReason() {
        return refundFailReason;
    }

    public void setRefundFailReason(String refundFailReason) {
        this.refundFailReason = refundFailReason;
    }

    public String getTipFlight() {
        return tipFlight;
    }

    public void setTipFlight(String tipFlight) {
        this.tipFlight = tipFlight;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public Integer getIntroducer() {
        return introducer;
    }

    public void setIntroducer(Integer introducer) {
        this.introducer = introducer;
    }

    public Byte getIntroducerType() {
        return introducerType;
    }

    public void setIntroducerType(Byte introducerType) {
        this.introducerType = introducerType;
    }

    public Byte getIntroducerIsVal() {
        return introducerIsVal;
    }

    public void setIntroducerIsVal(Byte introducerIsVal) {
        this.introducerIsVal = introducerIsVal;
    }

    public Integer getCouponUserId() {
        return couponUserId;
    }

    public void setCouponUserId(Integer couponUserId) {
        this.couponUserId = couponUserId;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }
}