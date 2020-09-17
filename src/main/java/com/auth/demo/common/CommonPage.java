package com.auth.demo.common;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 分页返回结果
 */
public class CommonPage<T> {
    @ApiModelProperty(value = "页数")
    private int pageNum;
    @ApiModelProperty(value = "条数")
    private int pageSize;
    @ApiModelProperty(value = "总页数")
    private int totalPage;
    @ApiModelProperty(value = "总数据量")
    private long total;
    @ApiModelProperty(value = "数据列表")
    private List<T> list;


    public static <T> CommonPage<T> result(int pageNum, int pageSize, int totalPage, long total, List<T> list) {
        CommonPage<T> result = new CommonPage<>();
        result.pageNum = pageNum;
        result.pageSize = pageSize;
        result.totalPage = totalPage;
        result.total = total;
        result.list = list;

        return result;
    }

    /**
     * 将PageHelper分页后的list转为分页信息(弃用辣鸡)
     */
    public static <T> CommonPage<T> resultPage(List<T> list){
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalPage(pageInfo.getPages());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

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

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
