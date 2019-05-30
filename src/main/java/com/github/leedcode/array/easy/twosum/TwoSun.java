package com.github.leedcode.array.easy.twosum;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-05-29 18:27
 */
public class TwoSun {
    public static void main(String[] args) {
        twoSum(new int[]{1,2,3,4},3);
        System.out.println(JSON.toJSONString(twoSum(new int[]{1,2,3,4},3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
