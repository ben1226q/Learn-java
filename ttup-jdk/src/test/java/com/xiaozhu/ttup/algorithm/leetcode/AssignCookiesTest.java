package com.xiaozhu.ttup.algorithm.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AssignCookiesTest {

    @Test
    public void testTest(){

        List<Integer> kids = Arrays.asList(1,2);
        List<Integer> cks = Arrays.asList(1,3,2,4);
        int idx = 0;

        Comparator sortComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        kids.sort(sortComparator);
        cks.sort(sortComparator);

        for(int kid:kids){
            for (int ck:cks){
                if(ck>=kid){
                    idx++;
                    break;
                }
            }
        }
//        Arrays.sort();

        System.out.println("the max kid count is : "+idx);

//        System.out.println(kids.toString());
//        System.out.println(cks.toString());

    }

}
