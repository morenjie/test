package com.qf.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbContent)实体类
 *
 * @author makejava
 * @since 2022-05-05 21:40:39
 */
public class TbContent implements Serializable {
    private static final long serialVersionUID = -40875856749539019L;
    
    private Long id;
    /**
    * 内容类目ID
    */
    private Long categoryId;
    /**
    * 内容标题
    */
    private String title;
    /**
    * 子标题
    */
    private String subTitle;
    /**
    * 标题描述
    */
    private String titleDesc;
    /**
    * 链接
    */
    private String url;
    /**
    * 图片绝对路径
    */
    private String pic;
    /**
    * 图片2
    */
    private String pic2;
    /**
    * 内容
    */
    private String content;
    
    private Date created;
    
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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