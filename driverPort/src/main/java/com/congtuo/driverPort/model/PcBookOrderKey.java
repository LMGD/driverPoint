package com.congtuo.driverPort.model;

public class PcBookOrderKey {
    private String orderCode;

    private String orderUuid;

    public PcBookOrderKey(String orderCode, String orderUuid) {
        this.orderCode = orderCode;
        this.orderUuid = orderUuid;
    }

    public PcBookOrderKey() {
        super();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }
}