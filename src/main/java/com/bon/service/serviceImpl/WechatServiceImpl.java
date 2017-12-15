package com.bon.service.serviceImpl;

import com.bon.mapper.WechatMapper;
import com.bon.model.Response.WechatResponse;
import com.bon.model.WechatListParams;
import com.bon.service.WechatService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类描述信息
 * com.bon.service
 *
 * @author pengwen
 * @create 2017/11/30 0030
 **/
@Service
public class WechatServiceImpl implements WechatService{

    @Autowired
    private WechatMapper wechatMapper;

    @Override
    public Page<WechatResponse> wechatList(WechatListParams params) {
        PageHelper.startPage(params);
        return wechatMapper.wechatList();
    }
}
