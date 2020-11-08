package com.xm.entity;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable{

    private Long total;
    private List rows;

    //当前页
    private Integer page;
    //每页展示数据
    private Integer pageSize;
    //总页码
    private Long totalPage;

    public PageResult() {
    }

    public PageResult(Long total, List rows, Integer page, Integer pageSize, Long totalPage) {
        this.total = total;
        this.rows = rows;
        this.page = page;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }
}
