package com.github.leedcode.array.easy.majorityelement;

import java.util.Arrays;

/**
 * @author yifeng.liu
 * @date 2019-07-03 15:25
 */
public class Easy {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
