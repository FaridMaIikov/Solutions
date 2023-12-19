package com.example.streamlibrary;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(9,8,7,6,5);
        System.out.println(sum(nums));
        System.out.println(sum2(nums));
    }

    public static int sum(List<Integer>nums){
        int total=0;
        for (Integer num : nums) {
            total+=num;
        }
        return total;
    }

    public static int sum2(List<Integer>nums){
       return nums.stream().reduce(Integer::sum).orElse(0);
    }
}
