package com.kfit.test.bean;

/**
 * 测试实体类.
 * Created by Allen on 2017/4/22 0022 上午 11:15.
 */
public class Demo {
    private long id;//主键.
    private String name;//测试名称.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}