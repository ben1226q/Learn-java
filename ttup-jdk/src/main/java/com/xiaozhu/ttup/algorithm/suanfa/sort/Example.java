package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Example {

    public static void sort(Comparable[] a){

    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    public static void show(Comparable []a){
        for(int i=0; i< a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable []a){
        for(int i=1; i<a.length; i++){
            if(less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String []args){
        String []a = new String[]{"1","2","3","4","5","6"};
        sort(a);
        System.out.println(isSorted(a));
        assert isSorted(a);
        show(a);
    }
}


