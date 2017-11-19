package com.xiaozhu.ttup.classloader;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void test1(){

//        String  bootClassPath= System.getProperty("sun.boot.class.path");
//        String  extDirs= System.getProperty("java.ext.dirs");
//        String  classPath= System.getProperty("java.class.path");
//
//        System.out.println(bootClassPath);
//        System.out.println(extDirs);
//        System.out.println(classPath);

        ClassLoader cl = Test.class.getClassLoader();

        System.out.println("ClassLoader is:"+cl.toString());

        System.out.println("ClassLoader\'s parent is:"+cl.getParent().toString());

//        System.out.println("ClassLoader\'s parent is:"+cl.getParent().getClass().getClassLoader().toString());
//
//        System.out.println("ClassLoader\'s parent is:"+cl.getParent().getParent().toString());

//        cl = Integer.class.getClassLoader();
//
//        System.out.println("ClassLoader is:"+cl.toString());

    }

}
