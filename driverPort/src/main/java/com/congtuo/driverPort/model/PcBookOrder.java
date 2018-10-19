package com.congtuo.driverPort.model;

import java.math.BigDecimal;
import java.util.Date;

public class PcBookOrder extends PcBookOrderKey {
    private String pcOrderCode;

    private String name;

    private String mobile;

    private Date useTime;

    private Float price;

    private String depart;

    private String departDetail;

    private String termini;

    private String terminiDetail;

    private Integer driverId;

    private Integer status;

    private Date robTime;

    private Integer cancleId;

    private Integer cancleType;

    private String cancelReason;

    private Date cancleTime;

    private Integer addType;

    private Integer addId;

    private Date addTime;

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

    private Float originalPrice;

    private Integer lugNum;

    private Integer voteNum;

    private String routeName;

    private String routeSt;

    private String routeEnd;

    private Boolean isBale;

    private String vip;

    private Integer introducer;

    private Byte introducerType;

    private Byte introducerIsVal;

    private String routeUuid;

    private Integer sourceId;

    private String refundNote;

    private String refundPrice;

    private String thirdCode;

    private String refundFailReason;

    private Byte payType;

    private Integer couponUserId;

    private BigDecimal couponAmount;

    private Date refundTime;

    private Integer orderType;

    public PcBookOrder(String orderCode, String orderUuid, String pcOrderCode, String name, String mobile, Date useTime, Float price, String depart, String departDetail, String termini, String terminiDetail, Integer driverId, Integer status, Date robTime, Integer cancleId, Integer cancleType, String cancelReason, Date cancleTime, Integer addType, Integer addId, Date addTime, Date updateTime, Date delTime, Date takeTime, Date atTime, Date beginTime, Date endTime, Integer timeStatus, String cityCode, Boolean isDel, String stJw, String endJw, Integer robType, Integer forecast, Integer distance, Integer changeStatus, Boolean isArchive, Float originalPrice, Integer lugNum, Integer voteNum, String routeName, String routeSt, String routeEnd, Boolean isBale, String vip, Integer introducer, Byte introducerType, Byte introducerIsVal, String routeUuid, Integer sourceId, String refundNote, String refundPrice, String thirdCode, String refundFailReason, Byte payType, Integer couponUserId, BigDecimal couponAmount, Date refundTime, Integer orderType) {
        super(orderCode, orderUuid);
        this.pcOrderCode = pcOrderCode;
        this.name = name;
        this.mobile = mobile;
        this.useTime = useTime;
        this.price = price;
        this.depart = depart;
        this.departDetail = departDetail;
        this.termini = termini;
        this.terminiDetail = terminiDetail;
        this.driverId = driverId;
        this.status = status;
        this.robTime = robTime;
        this.cancleId = cancleId;
        this.cancleType = cancleType;
        this.cancelReason = cancelReason;
        this.cancleTime = cancleTime;
        this.addType = addType;
        this.addId = addId;
        this.addTime = addTime;
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
        this.originalPrice = originalPrice;
        this.lugNum = lugNum;
        this.voteNum = voteNum;
        this.routeName = routeName;
        this.routeSt = routeSt;
        this.routeEnd = routeEnd;
        this.isBale = isBale;
        this.vip = vip;
        this.introducer = introducer;
        this.introducerType = introducerType;
        this.introducerIsVal = introducerIsVal;
        this.routeUuid = routeUuid;
        this.sourceId = sourceId;
        this.refundNote = refundNote;
        this.refundPrice = refundPrice;
        this.thirdCode = thirdCode;
        this.refundFailReason = refundFailReason;
        this.payType = payType;
        this.couponUserId = couponUserId;
        this.couponAmount = couponAmount;
        this.refundTime = refundTime;
        this.orderType = orderType;
    }

    public PcBookOrder() {
        super();
    }

    public String getPcOrderCode() {
        return pcOrderCode;
    }

    public void setPcOrderCode(String pcOrderCode) {
        this.pcOrderCode = pcOrderCode;
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

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
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

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getLugNum() {
        return lugNum;
    }

    public void setLugNum(Integer lugNum) {
        this.lugNum = lugNum;
    }

    public Integer getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(Integer voteNum) {
        this.voteNum = voteNum;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteSt() {
        return routeSt;
    }

    public void setRouteSt(String routeSt) {
        this.routeSt = routeSt;
    }

    public String getRouteEnd() {
        return routeEnd;
    }

    public void setRouteEnd(String routeEnd) {
        this.routeEnd = routeEnd;
    }

    public Boolean getIsBale() {
        return isBale;
    }

    public void setIsBale(Boolean isBale) {
        this.isBale = isBale;
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

    public String getRouteUuid() {
        return routeUuid;
    }

    public void setRouteUuid(String routeUuid) {
        this.routeUuid = routeUuid;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
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

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public String getRefundFailReason() {
        return refundFailReason;
    }

    public void setRefundFailReason(String refundFailReason) {
        this.refundFailReason = refundFailReason;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}