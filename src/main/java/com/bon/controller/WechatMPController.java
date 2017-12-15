package com.bon.controller;

import com.bon.common.bean.ResultBody;
import com.bon.model.Response.WechatResponse;
import com.bon.model.WechatListParams;
import com.bon.service.WechatService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    private WechatService wechatService;

    @PostMapping(value = "/wechatList")
    @ApiOperation(
            value = "/wechatList",
            notes = "公众号列表",
            httpMethod = "POST",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponse(code = 200,message = "success")
    public String wechatList(@RequestBody WechatListParams params){
        Page<WechatResponse> list=wechatService.wechatList(params);
        return new ResultBody(new PageInfo<>(list)).toJsonString();
    }
}
