package com.xiaozhu.ttup.generic.args;

//https://blog.csdn.net/s10461/article/details/53941091
public class Args {

    public static <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试 "+ "t is " + t);
        }
    }

    public static void main(String args[]){
        printMsg("111",222,"aaaa","2323.4",55.55);
    }
}
