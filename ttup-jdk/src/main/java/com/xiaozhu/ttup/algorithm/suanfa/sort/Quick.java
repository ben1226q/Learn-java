package com.xiaozhu.ttup.algorithm.suanfa.sort;

import com.alibaba.fastjson.JSONObject;

import java.util.zip.InflaterInputStream;

public class Quick extends Example{

//    public static void sort(Integer []a){
//        sort(a, 0, a.length-1);
//    }
//
//    public static void sort(Integer []a, int lo, int hi){
//        if(hi<=lo) return;
//        int j = partition(a, lo, hi);
//        sort(a, lo, j-1);
//        sort(a, j+1, hi);
//    }
//
//    private static int partition(Integer []a, int lo, int hi){
//        int i=lo, j=hi+1;
//        Integer v = a[lo];
//        while (true){
//            while (less(a[++i],v)) if (i==hi) break;
//            while (less(v, a[--j])) if (j==lo) break;
//            if(i>=j) break;
//            exch(a, i, j);
//        }
//        exch(a ,lo, j);
//        return j;
//    }

    public static void sort(Integer []a){

        long time = System.currentTimeMillis();
        for(int i=0; i<a.length; i++){
            int k = i;
            int n=0, m =a.length-1;

            for(; n<a.length; n++){
                if(a[n]>a[i]){
                    break;
                }
            }

            for(; m>=0; m--){
                if(a[m]<a[i]){
                    break;
                }
            }

            System.out.println(n+" -- "+m);

//            break;
            if(m==n){
                exch(a, k, m);
                break;
            }else{
                exch(a, n, m);
            }
            System.out.println("Quick cost time: " + JSONObject.toJSONString(a));
//            break;
        }
        System.out.println("Quick cost time1: " + JSONObject.toJSONString(a));
        System.out.println("Quick cost time: " + (System.currentTimeMillis() - time));
    }

}
