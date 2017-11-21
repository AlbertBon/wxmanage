package com.bon.controller;

import com.bon.common.bean.ExceptionType;
import com.bon.common.exception.BusinessException;
import com.bon.dao.UserMapper;
import com.bon.entity.User;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 Mysql-Mybatis 的功能
 */
@RestController
@RequestMapping("/sql")
public class MysqlController {
    private final UserMapper userMapper;

    @Autowired
    public MysqlController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @ApiOperation(value = "获取信息", response = User.class)
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户id", dataType = "Integer")
//    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success")
    })
    @GetMapping(value = "/get_user")
    public User GetUser(@ApiParam(name = "id",value = "用户id",required = true)@RequestParam int id) {
        return userMapper.findById(id);
    }

    @ApiOperation(value = "异常抛出", response = User.class)
//    @ApiImplicitParam(name = "id", value = "用户id", dataType = "Integer")
    @ApiResponse(code = 200, message = "success")
    @GetMapping(value = "/throw_exception")
    public User ThrowException(@RequestParam(value = "id") Integer id) throws BusinessException {
        if (id == 1)
            throw new BusinessException(ExceptionType.DATA_ERROR);
        return userMapper.findById(id);
    }
}
