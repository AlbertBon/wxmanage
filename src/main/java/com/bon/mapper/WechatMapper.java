package com.bon.mapper;

import com.bon.entity.Wechat;
import com.bon.model.Response.WechatResponse;
import com.bon.util.MyMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WechatMapper extends MyMapper<Wechat>{

    @Select("select *,date_format(create_time,'%Y-%m-%d') as create_date from tb_wechat_mp where id=#{id}")
    WechatResponse findById(@Param("id") int id);

    @Select("select *,date_format(create_time,'%Y-%m-%d') as create_date from tb_wechat_mp")
    Page<WechatResponse> wechatList();
}