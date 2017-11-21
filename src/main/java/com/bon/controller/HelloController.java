package com.bon.controller;

import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述信息
 * com.bon.controller
 *
 * @author pengwen
 * @create 2017/11/6 0006
 **/
@RestController
@RequestMapping("hello")
@Api(value = "/hello", description = "测试")
public class HelloController {

    @GetMapping(value = "/index")
    @ApiOperation(
            value = "/index",
            notes = "欢迎页面主页",
            httpMethod = "GET",
            produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE
    )
    @ApiResponses(
            {@ApiResponse(code = 200,message = "success")}
    )
    public String hello(@ApiParam(name = "name",value = "用户姓名",required = true)@RequestParam String name) {
        return "Hello "+name;
    }
}
