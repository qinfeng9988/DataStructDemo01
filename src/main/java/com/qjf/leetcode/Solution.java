package com.qjf.leetcode;

/**
 * @author 秦江峰
 * @AddTime 2020/4/8 18:54
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
        int result = removeDuplicates(ints);
        System.out.print("result:" + result);
        System.out.print("==========");
        ;
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int end = 0, j;
        for (j = 1; j < nums.length; j++) {
            if (nums[j] > nums[end]) {
                end++;
                nums[end] = nums[j];

            }
        }
        end++;
        return end;
    }

}
