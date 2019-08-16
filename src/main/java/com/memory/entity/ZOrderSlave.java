package com.memory.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ZOrderSlave {
    private String id;
    private String warehouseId;
    private String goodsId;
    private BigDecimal goodsPrice;
    private int goodsCount;
    private BigDecimal goodsTotal;
    private String goodsName;
    private String goodsShowImg;
    private int orderSlaveState;
    private Date orderSlaveStateTime;
    private String orderSlaveRemark;
    private String userId;
    private String orderMasterId;
    private String orderDetailId;
    private String logisticsId;
    private Date createTime;
    private String year;
    private String month;
    private String day;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(BigDecimal goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsShowImg() {
        return goodsShowImg;
    }

    public void setGoodsShowImg(String goodsShowImg) {
        this.goodsShowImg = goodsShowImg;
    }

    public int getOrderSlaveState() {
        return orderSlaveState;
    }

    public void setOrderSlaveState(int orderSlaveState) {
        this.orderSlaveState = orderSlaveState;
    }

    public Date getOrderSlaveStateTime() {
        return orderSlaveStateTime;
    }

    public void setOrderSlaveStateTime(Date orderSlaveStateTime) {
        this.orderSlaveStateTime = orderSlaveStateTime;
    }

    public String getOrderSlaveRemark() {
        return orderSlaveRemark;
    }

    public void setOrderSlaveRemark(String orderSlaveRemark) {
        this.orderSlaveRemark = orderSlaveRemark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderMasterId() {
        return orderMasterId;
    }

    public void setOrderMasterId(String orderMasterId) {
        this.orderMasterId = orderMasterId;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ZOrderSlave{" +
                "id='" + id + '\'' +
                ", warehouseId='" + warehouseId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsCount='" + goodsCount + '\'' +
                ", goodsTotal=" + goodsTotal +
                ", goodsName='" + goodsName + '\'' +
                ", goodsShowImg='" + goodsShowImg + '\'' +
                ", orderSlaveState=" + orderSlaveState +
                ", orderSlaveStateTime=" + orderSlaveStateTime +
                ", orderSlaveRemark='" + orderSlaveRemark + '\'' +
                ", userId='" + userId + '\'' +
                ", orderMasterId='" + orderMasterId + '\'' +
                ", orderDetailId='" + orderDetailId + '\'' +
                ", logisticsId='" + logisticsId + '\'' +
                ", createTime=" + createTime +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZOrderSlave that = (ZOrderSlave) o;
        return orderSlaveState == that.orderSlaveState &&
                goodsCount == that.goodsCount &&
                Objects.equals(id, that.id) &&
                Objects.equals(warehouseId, that.warehouseId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goodsPrice, that.goodsPrice) &&
                Objects.equals(goodsTotal, that.goodsTotal) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(goodsShowImg, that.goodsShowImg) &&
                Objects.equals(orderSlaveStateTime, that.orderSlaveStateTime) &&
                Objects.equals(orderSlaveRemark, that.orderSlaveRemark) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(orderMasterId, that.orderMasterId) &&
                Objects.equals(orderDetailId, that.orderDetailId) &&
                Objects.equals(logisticsId, that.logisticsId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warehouseId, goodsId, goodsPrice, goodsCount, goodsTotal, goodsName, goodsShowImg, orderSlaveState, orderSlaveStateTime, orderSlaveRemark, userId, orderMasterId, orderDetailId, logisticsId, createTime, year, month, day);
    }
}
