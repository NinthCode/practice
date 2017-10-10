package com.paouke.code.practice.leetcode.array.T485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, now = 0;
        for (int num : nums) {
            if (num == 1) {
                now++;
                if (max < now) {
                    max = now;
                }
            } else {
                now = 0;
            }
        }
        return max;
    }
}
