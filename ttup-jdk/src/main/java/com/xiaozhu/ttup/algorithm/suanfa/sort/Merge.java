package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Merge extends Example{

    private static Integer []aux;

    public static void merge(Integer []a, int lo, int mid, int hi){

        int i= lo, j=mid+1;
        for(int k=lo; k <=hi; k++){
            aux[k] = a[k];
        }

        for(int k=lo; k<= hi; k++){
            if(i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if(less (aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void sort(Integer[] a){
        long time = System.currentTimeMillis();
        aux = new Integer[a.length];
        sort(a, 0, a.length-1);
        System.out.println("Selection cost time: "+(System.currentTimeMillis()-time));
    }

    private static void sort(Integer []a, int lo, int hi){
        if(hi<=lo) return;
        int mid = lo+(hi-lo)/2;
        sort(a,lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }


}
