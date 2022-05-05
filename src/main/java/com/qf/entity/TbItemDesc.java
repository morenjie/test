package com.qf.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品描述表(TbItemDesc)实体类
 *
 * @author makejava
 * @since 2022-05-05 21:40:45
 */
public class TbItemDesc implements Serializable {
    private static final long serialVersionUID = 351328948399075783L;
    /**
    * 商品ID
    */
    private Long itemId;
    /**
    * 商品描述
    */
    private String itemDesc;
    /**
    * 创建时间
    */
    private Date created;
    /**
    * 更新时间
    */
    private Date updated;


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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