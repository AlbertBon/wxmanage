package com.bon.controller;

import com.bon.common.bean.ResultBody;
import com.bon.dao.WechatMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公众号信息管理
 * com.bon.controller
 *
 * @author pengwen
 * @create 2017/11/9 0009
 **/
@RestController
@RequestMapping("wechat")
public class WechatMPController {

    @Autowired
    private WechatMapper wechatMapper;

    @GetMapping(value = "/wechatList")
    @ApiOperation(
            value = "/wechatList",
            notes = "公众号列表",
            httpMethod = "GET",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponse(code = 200,message = "success")
    public String wechatList(){
        return new ResultBody(200,"success",wechatMapper.list()).toJsonString();
    }
}
