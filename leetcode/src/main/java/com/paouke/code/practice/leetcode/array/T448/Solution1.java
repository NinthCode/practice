package com.paouke.code.practice.leetcode.array.T448;

import java.util.ArrayList;
import java.util.List;

//看到的更简单的解法
//主要目的就是把不存在对应数字的位置设置为与其他的数组位置不一样
public class Solution1 {
    public List findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public List findMaxConsecutiveOnes1(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) nums[(nums[i] - 1) % nums.length] += nums.length;
        for(int i = 0; i < nums.length; i++) if(nums[i] <= nums.length) list.add(i + 1);
        return list;
    }

    public static void main(String[] args){
        System.out.println(new Solution1().findMaxConsecutiveOnes1(new int[]{4,3,2,7,8,2,3,1}));
    }
}
