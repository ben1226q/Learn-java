package com.xiaozhu.ttup.proxy.cglib;

public class UserDAO {
    public void add(Object o) {
        System.out.println("UserDAO -> Add: " + o.toString());
    }

    public void get(Object o) {
        System.out.println("UserDAO -> Get: " + o.toString());
    }

    public void sub(Object o) {
        System.out.println("UserDAO -> Sub1: " + o.toString());
    }
}
