package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Selection extends Example{

    /**
     * 时间复杂度
     * @param a
     * @return
     */
    public static Integer[] sort(Integer []a){
        long time = System.currentTimeMillis();
        if(a==null || a.length==1){
            return a;
        }
        for(int i=0; i<a.length; i++){
            for (int j=i; j<a.length; j++){
                if(less(a[j], a[i])){
                    exch(a, j, i);
                }
            }
        }
        System.out.println("Selection cost time: "+(System.currentTimeMillis()-time));
        return a;
    }

}
