package com.dzf.pojo;

import java.util.Date;

public class NewsDetail {

    private Integer id;

    private String title;

    private String summary;

    private String author;

    private Date createdate;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
