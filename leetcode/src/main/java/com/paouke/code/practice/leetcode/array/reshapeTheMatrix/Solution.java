package com.paouke.code.practice.leetcode.array.reshapeTheMatrix;

import java.util.Arrays;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] newNums = new int[r][c];
        int c1 = 0, c2 = 0, c3 = 0,c4 = 0;
        int count = 0;
        while(count < r * c) {
            newNums[c3][c4] = nums[c1][c2];
            c2 ++;
            c4 ++;
            if(c2 >= nums[0].length) {
                c1 ++;
                c2 = 0;
            }
            if(c4 >= c) {
                c3 ++;
                c4 = 0;
            }
            count ++;
        }
        return newNums;
    }
    public static void main(String[] args){
        int[][] nums = new Solution().matrixReshape(new int[][]{{1,2},{3,4}}, 2,4);
        for(int i = 0; i < nums.length;i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
