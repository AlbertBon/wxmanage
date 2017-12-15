package com.bon.service.serviceImpl;

import com.bon.entity.User;
import com.bon.mapper.UserMapper;
import com.bon.model.UserListParams;
import com.bon.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类描述信息
 * com.bon.service
 *
 * @author pengwen
 * @create 2017/11/24 0024
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<User> userList(UserListParams params) {
        PageHelper.startPage(params);
        Page<User> userList= (Page<User>) userMapper.selectAll();
        return new PageInfo<>(userList);
    }

    @Override
    public Page<User> userPage() {
        PageHelper.startPage(1,2,"id");
        return userMapper.userPage();
    }
}
