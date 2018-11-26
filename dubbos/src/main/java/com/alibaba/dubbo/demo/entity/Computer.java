package com.alibaba.dubbo.demo.entity;

import java.io.Serializable;

public class Computer implements Serializable {
    private static final long serialVersionUID = -8956826694546044434L;
    private Integer id;
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}