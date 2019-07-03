package com.github.leedcode.array.easy.maximumsubarray;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-03 11:36
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(JSON.toJSONString(maxSubArray(nums)));
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = nums[0], ans = sum;

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) {
                sum = nums[i];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
