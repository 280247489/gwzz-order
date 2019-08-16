package com.memory.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ZOrderMaster {
    private String id;
    private int orderState;
    private int orderNormalState;
    private int orderReturnState;
    private String orderShowUrl;
    private String orderShowDescribe;
    private int orderShowCount;
    private BigDecimal orderShowTotal;
    private String orderRemark;
    private String shrName;
    private String shrTel;
    private String shrProvince;
    private String shrCity;
    private String shrArea;
    private String shrAddr;
    private int invoiceState;
    private String invoiceId;
    private int delYn;
    private String payId;
    private String userId;
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

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getOrderNormalState() {
        return orderNormalState;
    }

    public void setOrderNormalState(int orderNormalState) {
        this.orderNormalState = orderNormalState;
    }

    public int getOrderReturnState() {
        return orderReturnState;
    }

    public void setOrderReturnState(int orderReturnState) {
        this.orderReturnState = orderReturnState;
    }

    public String getOrderShowUrl() {
        return orderShowUrl;
    }

    public void setOrderShowUrl(String orderShowUrl) {
        this.orderShowUrl = orderShowUrl;
    }

    public String getOrderShowDescribe() {
        return orderShowDescribe;
    }

    public void setOrderShowDescribe(String orderShowDescribe) {
        this.orderShowDescribe = orderShowDescribe;
    }

    public int getOrderShowCount() {
        return orderShowCount;
    }

    public void setOrderShowCount(int orderShowCount) {
        this.orderShowCount = orderShowCount;
    }

    public BigDecimal getOrderShowTotal() {
        return orderShowTotal;
    }

    public void setOrderShowTotal(BigDecimal orderShowTotal) {
        this.orderShowTotal = orderShowTotal;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getShrName() {
        return shrName;
    }

    public void setShrName(String shrName) {
        this.shrName = shrName;
    }

    public String getShrTel() {
        return shrTel;
    }

    public void setShrTel(String shrTel) {
        this.shrTel = shrTel;
    }

    public String getShrProvince() {
        return shrProvince;
    }

    public void setShrProvince(String shrProvince) {
        this.shrProvince = shrProvince;
    }

    public String getShrCity() {
        return shrCity;
    }

    public void setShrCity(String shrCity) {
        this.shrCity = shrCity;
    }

    public String getShrArea() {
        return shrArea;
    }

    public void setShrArea(String shrArea) {
        this.shrArea = shrArea;
    }

    public String getShrAddr() {
        return shrAddr;
    }

    public void setShrAddr(String shrAddr) {
        this.shrAddr = shrAddr;
    }

    public int getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(int invoiceState) {
        this.invoiceState = invoiceState;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getDelYn() {
        return delYn;
    }

    public void setDelYn(int delYn) {
        this.delYn = delYn;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return "ZOrderMaster{" +
                "id='" + id + '\'' +
                ", orderState=" + orderState +
                ", orderNormalState=" + orderNormalState +
                ", orderReturnState=" + orderReturnState +
                ", orderShowUrl='" + orderShowUrl + '\'' +
                ", orderShowDescribe='" + orderShowDescribe + '\'' +
                ", orderShowCount=" + orderShowCount +
                ", orderShowTotal=" + orderShowTotal +
                ", orderRemark='" + orderRemark + '\'' +
                ", shrName='" + shrName + '\'' +
                ", shrTel='" + shrTel + '\'' +
                ", shrProvince='" + shrProvince + '\'' +
                ", shrCity='" + shrCity + '\'' +
                ", shrArea='" + shrArea + '\'' +
                ", shrAddr='" + shrAddr + '\'' +
                ", invoiceState=" + invoiceState +
                ", invoiceId='" + invoiceId + '\'' +
                ", delYn=" + delYn +
                ", payId='" + payId + '\'' +
                ", userId='" + userId + '\'' +
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
        ZOrderMaster that = (ZOrderMaster) o;
        return orderState == that.orderState &&
                orderNormalState == that.orderNormalState &&
                orderReturnState == that.orderReturnState &&
                orderShowCount == that.orderShowCount &&
                invoiceState == that.invoiceState &&
                delYn == that.delYn &&
                Objects.equals(id, that.id) &&
                Objects.equals(orderShowUrl, that.orderShowUrl) &&
                Objects.equals(orderShowDescribe, that.orderShowDescribe) &&
                Objects.equals(orderShowTotal, that.orderShowTotal) &&
                Objects.equals(orderRemark, that.orderRemark) &&
                Objects.equals(shrName, that.shrName) &&
                Objects.equals(shrTel, that.shrTel) &&
                Objects.equals(shrProvince, that.shrProvince) &&
                Objects.equals(shrCity, that.shrCity) &&
                Objects.equals(shrArea, that.shrArea) &&
                Objects.equals(shrAddr, that.shrAddr) &&
                Objects.equals(invoiceId, that.invoiceId) &&
                Objects.equals(payId, that.payId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderState, orderNormalState, orderReturnState, orderShowUrl, orderShowDescribe, orderShowCount, orderShowTotal, orderRemark, shrName, shrTel, shrProvince, shrCity, shrArea, shrAddr, invoiceState, invoiceId, delYn, payId, userId, createTime, year, month, day);
    }
}
