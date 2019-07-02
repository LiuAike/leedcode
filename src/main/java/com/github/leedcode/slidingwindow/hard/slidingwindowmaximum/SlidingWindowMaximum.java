package com.github.leedcode.slidingwindow.hard.slidingwindowmaximum;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-02 09:04
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(JSON.toJSONString(maxSlidingWindow(nums,k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int maxArr[] = new int[nums.length - k + 1];

        if (nums.length == 0 || 0 == k) {

            return nums;
        }

        maxArr[0] = getMax(nums, 0, k - 1);//calculate the max for the first window

        int idx = 1;
        for (int i = k; i < nums.length; i++) {
            maxArr[idx] = getMax(nums, i - k + 1, i);//remove the left most item on the window, and add the next element to the new window and then find max
            idx++;
        }

        return maxArr;
    }

    //auxilery for finding max in the window/subarray
    static int getMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
