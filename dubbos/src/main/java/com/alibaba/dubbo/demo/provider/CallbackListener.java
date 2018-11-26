package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.entity.User;

import java.io.Serializable;


public interface CallbackListener extends Serializable{
    public User callBack(User v);
}