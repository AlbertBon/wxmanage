package com.bon.dao;

import com.bon.entity.Wechat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WechatMapper {

    @Select("select *,date_format(create_time,'%Y-%m-%d') as create_date from tb_wechat_mp where id=#{id}")
    Wechat findById(@Param("id") int id);

    @Select("select *,date_format(create_time,'%Y-%m-%d') as create_date from tb_wechat_mp")
    List<Wechat> list();
}