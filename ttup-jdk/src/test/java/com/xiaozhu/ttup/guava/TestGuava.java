package com.xiaozhu.ttup.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;

public class TestGuava {

    /**
     *
     *  omitEmptyStrings: 忽略split后的空字符串
        trimResults: trim一下结果
        splitToList: 返回一个List而不是数组
        limit: 返回的结果集size限制为3，只split前两个，后面就不split了而作为一个整体作为第三个元素
     */
    @Test
    public void test4() {
        List<String> list = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(",,a, b,c,,d,,");
        System.out.println(list.toString());
        List<String> list2 = Splitter.on(",").omitEmptyStrings().limit(3).trimResults().splitToList(",,a, b,c,,d,,");
        System.out.println(list2.toString());
    }

    @Test
    public void test1()
    {
        Joiner joiner = Joiner.on(",").skipNulls();
        String result = joiner.join("a", 1, null, 'c');
        System.out.println(result);
        String[] names = new String[]{"zhangsan", "lisi", "wangwu"};
        System.out.println(joiner.join(names));
    }

}
