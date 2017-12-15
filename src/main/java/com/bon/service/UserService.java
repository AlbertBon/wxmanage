package com.bon.service;

import com.bon.entity.User;
import com.bon.model.UserListParams;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * 类描述信息
 * com.bon.service.serviceImpl
 *
 * @author pengwen
 * @create 2017/11/24 0024
 **/
public interface UserService {

    /**
     * 根据id获取user
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 获取用户列表
     * @return
     */
    PageInfo<User> userList(UserListParams params);

    /**
     * 分页查询
     * @return
     */
    Page<User> userPage();
}
