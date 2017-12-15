package com.bon.model.Response;

import java.util.Date;

/**
 * 类描述信息
 * com.bon.model.Response
 *
 * @author pengwen
 * @create 2017/11/30 0030
 **/
public class WechatResponse {

    private Integer id;

    private String appName;

    private String appId;

    private String appSecret;

    private Integer isCurrent;

    private String actoken;

    private Date createTime;

    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public Integer getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent;
    }

    public String getActoken() {
        return actoken;
    }

    public void setActoken(String actoken) {
        this.actoken = actoken;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
