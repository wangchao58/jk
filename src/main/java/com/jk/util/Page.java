package com.jk.util;


import java.util.List;

/**
 * 分页类
 * @param <T>
 */
public class Page<T> {
    private int page;//第几页

    private int pageSize;//每页多少条

    private long total;//总页

    private List<T> rows;// 列表

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }




}
