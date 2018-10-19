package com.congtuo.driverPort.model;

import java.math.BigDecimal;
import java.util.Date;

public class bcOrder {
    private String orderCode;

    private String name;

    private String mobile;

    private Date addTime;

    private Date useTime;

    private Double useDays;

    private Integer productId;

    private Integer carTypeId;

    private Integer sourceId;

    private String thirdCode;

    private Float price;

    private Integer driverId;

    private String depart;

    private String departDetail;

    private Integer status;

    private Integer auditingStatus;

    private Date robTime;

    private Integer cancleId;

    private Integer cancleType;

    private String cancelReason;

    private Date cancleTime;

    private Integer addType;

    private Integer addId;

    private Date delTime;

    private String cityCode;

    private String terminiCity;

    private Boolean isDel;

    private String stJw;

    private Integer robType;

    private Boolean isArchive;

    private String orderUuid;

    private Float deviationPrice;

    private Byte payType;

    private Float originalPrice;

    private String refundNote;

    private String refundPrice;

    private String refundFailReason;

    private String extraPrice;

    private Boolean extraType;

    private String extraOrderid;

    private String vip;

    private Integer introducer;

    private Byte introducerType;

    private Byte introducerIsVal;

    private Integer couponUserId;

    private BigDecimal couponAmount;

    private Integer extraDriverPrice;

    private Date refundTime;

    public bcOrder(String orderCode, String name, String mobile, Date addTime, Date useTime, Double useDays, Integer productId, Integer carTypeId, Integer sourceId, String thirdCode, Float price, Integer driverId, String depart, String departDetail, Integer status, Integer auditingStatus, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date delTime, String cityCode, String terminiCity, Boolean isDel, String stJw, Integer robType, Boolean isArchive, String orderUuid, Float deviationPrice, Byte payType, Float originalPrice, String refundNote, String refundPrice, String refundFailReason, String extraPrice, Boolean extraType, String extraOrderid, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, Integer couponUserId, BigDecimal couponAmount, Integer extraDriverPrice, Date refundTime) {
        this.orderCode = orderCode;
        this.name = name;
        this.mobile = mobile;
        this.addTime = addTime;
        this.useTime = useTime;
        this.useDays = useDays;
        this.productId = productId;
        this.carTypeId = carTypeId;
        this.sourceId = sourceId;
        this.thirdCode = thirdCode;
        this.price = price;
        this.driverId = driverId;
        this.depart = depart;
        this.departDetail = departDetail;
        this.status = status;
        this.auditingStatus = auditingStatus;
        this.robTime = robTime;
        this.cancleId = cancleId;
        this.cancleType = cancleType;
        this.cancelReason = cancelReason;
        this.cancleTime = cancleTime;
        this.addType = addType;
        this.addId = addId;
        this.delTime = delTime;
        this.cityCode = cityCode;
        this.terminiCity = terminiCity;
        this.isDel = isDel;
        this.stJw = stJw;
        this.robType = robType;
        this.isArchive = isArchive;
        this.orderUuid = orderUuid;
        this.deviationPrice = deviationPrice;
        this.payType = payType;
        this.originalPrice = originalPrice;
        this.refundNote = refundNote;
        this.refundPrice = refundPrice;
        this.refundFailReason = refundFailReason;
        this.extraPrice = extraPrice;
        this.extraType = extraType;
        this.extraOrderid = extraOrderid;
        this.vip = vip;
        this.introducer = introducer;
        this.introducerType = introducerType;
        this.introducerIsVal = introducerIsVal;
        this.couponUserId = couponUserId;
        this.couponAmount = couponAmount;
        this.extraDriverPrice = extraDriverPrice;
        this.refundTime = refundTime;
    }

    public bcOrder() {
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

    public Double getUseDays() {
        return useDays;
    }

    public void setUseDays(Double useDays) {
        this.useDays = useDays;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Integer auditingStatus) {
        this.auditingStatus = auditingStatus;
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

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTerminiCity() {
        return terminiCity;
    }

    public void setTerminiCity(String terminiCity) {
        this.terminiCity = terminiCity;
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

    public Integer getRobType() {
        return robType;
    }

    public void setRobType(Integer robType) {
        this.robType = robType;
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

    public Float getDeviationPrice() {
        return deviationPrice;
    }

    public void setDeviationPrice(Float deviationPrice) {
        this.deviationPrice = deviationPrice;
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

    public String getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(String extraPrice) {
        this.extraPrice = extraPrice;
    }

    public Boolean getExtraType() {
        return extraType;
    }

    public void setExtraType(Boolean extraType) {
        this.extraType = extraType;
    }

    public String getExtraOrderid() {
        return extraOrderid;
    }

    public void setExtraOrderid(String extraOrderid) {
        this.extraOrderid = extraOrderid;
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

    public Integer getExtraDriverPrice() {
        return extraDriverPrice;
    }

    public void setExtraDriverPrice(Integer extraDriverPrice) {
        this.extraDriverPrice = extraDriverPrice;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }
}