package com.xiaozhu.ttup.algorithm.suanfa.sort;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTest {

    @Test
    public void testSelection(){
        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        Selection.sort(a);
        assert Selection.isSorted(a);
        System.out.println(JSONObject.toJSONString(a));
    }


    @Test
    public void testInsertion(){
        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        Insertion.sort(a);
        assert Insertion.isSorted(a);
        System.out.println(JSONObject.toJSONString(a));
    }

    @Test
    public void testShell(){
//        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        Integer []a = new Integer[]{8,9,1,7,2,3,5,4,6,0};
        System.out.println(a.length);
        Shell.sort1(a);
//        System.out.println(JSONObject.toJSONString(a));
//        assert Shell.isSorted(a);
        System.out.println(JSONObject.toJSONString(a));
    }

    @Test
    public void testMerge(){
//        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        Integer []a = new Integer[]{8,9,1,7,2,3,5,4,6,0};
        System.out.println(a.length);
        Merge.sort(a);
        System.out.println(JSONObject.toJSONString(a));
        assert Merge.isSorted(a);
        System.out.println(JSONObject.toJSONString(a));
    }

    @Test
    public void testQuick(){
//        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        Integer []a = new Integer[]{8,9,1,7,2,3,5,4,6,0};
        System.out.println(JSONObject.toJSONString(a));
        Quick.sort(a);
        System.out.println(JSONObject.toJSONString(a));
        assert Quick.isSorted(a);
        System.out.println(JSONObject.toJSONString(a));
    }


    @Test
    public void testCompare(){

//        Integer []a = new Integer[]{2,43,54,24,343,24,145,56,2321,123,23,121};
        List<Integer> list = new ArrayList<Integer>(100000000);
        for(int i=0; i<100000000; i++){
            list.add(new Random().nextInt(1000000000));
        }
        Integer []a = new Integer[0];
        Integer []b = new Integer[0];
        Integer []c = new Integer[0];
        Integer []d = new Integer[0];
//        a = list.toArray(a);
//        b = list.toArray(b);
        c = list.toArray(c);
        d = list.toArray(d);
//        Selection.sort(a);
//        Insertion.sort(b);
        Shell.sort1(c);
        Merge.sort(d);
//        assert Selection.isSorted(a);
//        assert Selection.isSorted(b);
        assert Shell.isSorted(c);
        assert Merge.isSorted(d);
//        System.out.println(JSONObject.toJSONString(a));
    }

    @Test
    public void testIf(){
        int i = 10;
        if(i>1){
            System.out.println("i>1");
        }else if(i>3){
            System.out.println("i>3");
        }else if(i>4){
            System.out.println("i>4");
        }else{
            System.out.println(i);
        }
    }

    @Test
    public void testIf1(){
        int i = 1;
        for(int j=0; j<i; j++){
            System.out.println(j);
        }
    }
}
