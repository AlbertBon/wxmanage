package com.bon.common.bean;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ResultBody<T> implements Serializable {

    private static final long serialVersionUID = 3997124446365032582L;

    /**
     * 返回码
     */
    @ApiModelProperty(value = "返回码", required = true)
    private Integer code = 200;

    /**
     * 消息提示
     */
    @ApiModelProperty(value = "消息提示")
    private String msg="success";

    /**
     * 数据
     */
    @ApiModelProperty(value = "数据", required = true)
    private T data;

    /**
     * 业务码
     */
    @ApiModelProperty(value = "业务码",hidden = true)
    private Integer bizCode;

    public ResultBody() {
        super();
    }

    public ResultBody(String msg) {
        super();
        this.msg = msg;
    }

    public ResultBody(T data) {
        super();
        this.data = data;
    }

    public ResultBody(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ResultBody(Integer code, String msg, T data) {
        super();
        this.code = (null==code) ? 200 : code;
        this.msg = (null==code) ? "success" : msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getBizCode() {
    	return bizCode;
    }

    public void setBizCode(Integer bizCode) {
    	this.bizCode = bizCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toJsonString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("response_code", getCode());
        jsonObject.put("message", getMsg());
        jsonObject.put("content", getData());
        return jsonObject.toJSONString();
    }


    public static JSONObject toJsonObject(Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("response_code", ExceptionType.SUCCESS.getCode());
        jsonObject.put("message", ExceptionType.SUCCESS.getMessage());
        jsonObject.put("content", data);
        return jsonObject;
    }
}
