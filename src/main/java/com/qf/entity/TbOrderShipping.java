package com.qf.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrderShipping)实体类
 *
 * @author makejava
 * @since 2022-05-05 21:40:46
 */
public class TbOrderShipping implements Serializable {
    private static final long serialVersionUID = -63725607108492504L;
    /**
    * 订单ID
    */
    private String orderId;
    /**
    * 收货人全名
    */
    private String receiverName;
    /**
    * 固定电话
    */
    private String receiverPhone;
    /**
    * 移动电话
    */
    private String receiverMobile;
    /**
    * 省份
    */
    private String receiverState;
    /**
    * 城市
    */
    private String receiverCity;
    /**
    * 区/县
    */
    private String receiverDistrict;
    /**
    * 收货地址，如：xx路xx号
    */
    private String receiverAddress;
    /**
    * 邮政编码,如：310001
    */
    private String receiverZip;
    
    private Date created;
    
    private Date updated;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}