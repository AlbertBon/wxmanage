package com.bon.service.serviceImpl;

import com.bon.entity.Wechat;
import com.bon.mapper.WechatMapper;
import com.bon.model.Response.WechatResponse;
import com.bon.model.WechatListParams;
import com.bon.service.WechatService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Override
    public Page<WechatResponse> wechatListPublic(WechatListParams params) {
        PageHelper.startPage(params);
        Page<Wechat> wechatList= (Page<Wechat>) wechatMapper.selectByExample(params.createExample(new Wechat()));
        Page<WechatResponse> responseList=new Page<>();
        BeanUtils.copyProperties(wechatList,responseList);
        for(Wechat wechat:wechatList){
            WechatResponse wechatResponse=new WechatResponse();
            BeanUtils.copyProperties(wechat,wechatResponse);
            wechatResponse.setCreateDate(wechat.getAppName());
            responseList.add(wechatResponse);
        }

        return responseList;
    }
}
