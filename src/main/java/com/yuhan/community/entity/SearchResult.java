package com.yuhan.community.entity;

import java.util.List;

/**
 * 自定义实体，用于暂存es中查询到的列表和总行数
 * @author yuhan
 * @create 2022-08-01 17:27
 */
public class SearchResult {
    private List<DiscussPost> list;
    private long total;
    public SearchResult(List<DiscussPost> list, long total) {
        this.list = list;
        this.total = total;
    }

    public List<DiscussPost> getList() {
        return list;
    }

    public void setList(List<DiscussPost> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
