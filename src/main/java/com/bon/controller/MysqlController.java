package com.bon.controller;

import com.bon.common.bean.ExceptionType;
import com.bon.common.bean.ResultBody;
import com.bon.common.exception.BusinessException;
import com.bon.entity.User;
import com.bon.model.UserListParams;
import com.bon.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 测试 Mysql-Mybatis 的功能
 */
@RestController
@RequestMapping("/sql")
public class MysqlController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取信息", response = ResultBody.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", dataType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success")
    })
    @GetMapping(value = "/get_user")
    public ResultBody<User> GetUser(@ApiParam(name = "id",value = "用户id",required = true)@RequestParam int id) {
        return new ResultBody<>(null,null,userService.getById(id));
    }

    @ApiOperation(value = "异常抛出", response = ResultBody.class)
    @ApiImplicitParam(name = "id", value = "用户id", dataType = "Integer")
    @ApiResponse(code = 200, message = "success")
    @GetMapping(value = "/throw_exception")
    public User ThrowException(@RequestParam(value = "id") Integer id) throws BusinessException {
        if (id == 1)
            throw new BusinessException(ExceptionType.DATA_ERROR);
        return userService.getById(id);
    }

    @ApiOperation(value = "用户列表",response = ResultBody.class)
    @ApiResponse(code = 200, message = "success")
    @PostMapping(value = "/userList",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultBody<PageInfo> userList(@RequestBody UserListParams params) throws BusinessException {
        PageInfo<User> pageInfo=userService.userList(params);
        return new ResultBody<>(pageInfo);
    }

    @ApiOperation(value = "用户列表分页",response = ResultBody.class)
    @ApiResponse(code = 200, message = "success")
    @GetMapping(value = "/userListPage")
    public ResultBody<Page> userListPage() throws BusinessException {

        Page<User> page=userService.userPage();
        return new ResultBody<>(page);
    }
}
