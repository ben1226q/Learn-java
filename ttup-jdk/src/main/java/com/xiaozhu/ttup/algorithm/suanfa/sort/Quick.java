package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Quick extends Example{

    public static void sort(Integer []a){
        sort(a, 0, a.length-1);
    }

    public static void sort(Integer []a, int lo, int hi){
        if(hi<=lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Integer []a, int lo, int hi){
        int i=lo, j=hi+1;
        Integer v = a[lo];
        while (true){
            while (less(a[++i],v)) if (i==hi) break;
            while (less(v, a[--j])) if (j==lo) break;
            if(i>=j) break;
            exch(a, i, j);
        }
        exch(a ,lo, j);
        return j;
    }
}
