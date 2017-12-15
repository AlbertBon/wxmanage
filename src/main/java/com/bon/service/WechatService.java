package com.bon.service;

import com.bon.model.Response.WechatResponse;
import com.bon.model.WechatListParams;
import com.github.pagehelper.Page;

/**
 * 类描述信息
 * com.bon.service
 *
 * @author pengwen
 * @create 2017/11/30 0030
 **/
public interface WechatService {

    Page<WechatResponse> wechatList(WechatListParams params);
}
