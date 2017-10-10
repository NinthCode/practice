package com.paouke.code.practice.leetcode.array.arrayPartitionI;

import java.util.Arrays;

public class SolutionBySort {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(new SolutionBySort().arrayPairSum(new int[]{3,4,1,2}));
    }
}
