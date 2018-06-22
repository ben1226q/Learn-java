package com.xiaozhu.ttup.algorithm.suanfa.sort;

public class Shell extends Example {

    public static Integer[] sort(Integer[] a) {
        long time = System.currentTimeMillis();
        if (a == null || a.length == 1) {
            return a;
        }
        for (int step = a.length / 2; step > 0; step = step / 2) {
//            for(int j=a.length-1; j>=step; j--){
//                if(less(a[j], a[j-step])){
//                    exch(a, j, j-step);
//                }
//            }
//            for(int k=0; k<a.length; k++){
//
//            }

            for (int j = step; j <= a.length - step; j = j + step) {
                if (less(a[j], a[j - step])) {
                    exch(a, j, j - step);
                } else {
                    break;
                }
            }

        }
        System.out.println("Shell cost time: " + (System.currentTimeMillis() - time));
        return a;
    }

    /**
     * 19      * 希尔排序 针对有序序列在插入时采用交换法
     * 20      * @param arr
     * 21
     */
    public static void sort1(Integer[] arr) {
        long time = System.currentTimeMillis();
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    //插入排序采用交换法
                    exch(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
        System.out.println("Shell cost time: " + (System.currentTimeMillis() - time));
    }

}
