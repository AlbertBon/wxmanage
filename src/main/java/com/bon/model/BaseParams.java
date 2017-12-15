package com.bon.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 类描述信息
 * com.bon.model
 *
 * @author pengwen
 * @create 2017/11/30 0030
 **/
@ApiModel
public class BaseParams {

    @ApiModelProperty(value = "当前页",example = "1")
    private int pageNum=1;
    @ApiModelProperty(value = "页面大小",example = "1000")
    private int pageSize=1000;
    @ApiModelProperty(value = "排序字段")
    private String orderBy;
    @ApiModelProperty(value = "是否进行count查询",example = "false",hidden = true)
    private boolean count;
    @ApiModelProperty(value = "分页合理化",example = "false",hidden = true)
    private Boolean reasonable;
    @ApiModelProperty(value = "当设置为true的时候，如果pagesize设置为0（或RowBounds的limit=0），就不执行分页，返回全部结果",example = "false",hidden = true)
    private Boolean pageSizeZero;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public boolean isCount() {
        return count;
    }

    public void setCount(boolean count) {
        this.count = count;
    }

    public Boolean getReasonable() {
        return reasonable;
    }

    public void setReasonable(Boolean reasonable) {
        this.reasonable = reasonable;
    }

    public Boolean getPageSizeZero() {
        return pageSizeZero;
    }

    public void setPageSizeZero(Boolean pageSizeZero) {
        this.pageSizeZero = pageSizeZero;
    }
}
