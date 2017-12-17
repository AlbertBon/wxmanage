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

    /**
     * 查询公众号列表，带分页
     * @param params
     * @return
     */
    Page<WechatResponse> wechatList(WechatListParams params);

    /**
     * 查询公众号列表（尝试通用方法）
     * @param params
     * @return
     */
    Page<WechatResponse> wechatListPublic(WechatListParams params);

}
