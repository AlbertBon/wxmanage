package com.bon.mapper;

import com.bon.entity.User;
import com.bon.util.MyMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends MyMapper<User>{

//    @Select("select * from tb_user where id=#{id}")
//    User findById(@Param("id") Integer id);

    @Select("select * from tb_user")
    Page<User> userPage();

}