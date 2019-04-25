package com.zhf6.model;

import java.util.Date;

public class TestDb {
    private String id;
    private String name;
    private Date date;
    private Integer singin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSingin() {
        return singin;
    }

    public void setSingin(Integer singin) {
        this.singin = singin;
    }
}
