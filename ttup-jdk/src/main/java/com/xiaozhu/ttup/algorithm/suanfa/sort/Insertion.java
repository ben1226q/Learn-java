package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Insertion extends Example{

    public static Integer[] sort(Integer []a){
        long time = System.currentTimeMillis();
        if(a==null || a.length==1){
            return a;
        }
        for(int i=1; i<a.length; i++){
            for(int j=i; j>0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
        System.out.println("Insertion cost time: "+(System.currentTimeMillis()-time));
        return a;
    }

}
