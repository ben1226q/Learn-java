package com.xiaozhu.ttup.classloader;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest2 {

    @Test
    public void test(){
        //创建自定义classloader对象。
        DiskClassLoader diskLoader = new DiskClassLoader("/Users/xiezhongchi/Downloads/");
        try {
            //加载class文件
            Class c = diskLoader.loadClass("com.xiaozhu.ttup.classloader.TestLoader");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    //通过反射调用Test类的say方法
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
