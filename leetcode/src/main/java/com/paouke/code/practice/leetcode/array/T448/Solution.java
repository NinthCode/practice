package com.paouke.code.practice.leetcode.array.T448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//T448,Find All Numbers Disappeared in an Array
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int inc = 0;
        while(inc < nums.length) {
            if(nums[inc] == -1) {
                inc++;
                continue;
            }
            if(nums[inc] != inc + 1 && nums[nums[inc] - 1] != nums[inc]) {
                int swap = nums[inc];
                nums[inc] = nums[swap - 1];
                nums[swap - 1] = swap;
            } else if(nums[inc] != inc + 1 && nums[nums[inc] - 1] == nums[inc]) {
                nums[inc] = -1;
                inc++;
            } else {
                inc ++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == -1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(new Solution().findDisappearedNumbers(new int[]{1,1,2,2,3,3,4,4}).toString());;
    }
}
