package com.ivaneye.intellijweb2.model;

import java.util.Date;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author wangyifan
 * @since 2018-02-12
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long recId;
    /**
     * 秒杀key
     */
    private String hkey;
    /**
     * 秒杀用户id
     */
    private Long uid;
    /**
     * 订单标题,notnull
     */
    private String title;
    /**
     * 订单内容
     */
    private String content;
    /**
     * 0待付款，1已付款，-1超时
     */
    private Integer status;


    public Long getRecId() {
        return recId;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public String getHkey() {
        return hkey;
    }

    public void setHkey(String hkey) {
        this.hkey = hkey;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
