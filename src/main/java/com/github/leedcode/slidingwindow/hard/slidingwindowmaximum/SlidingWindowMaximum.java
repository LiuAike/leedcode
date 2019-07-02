package com.github.leedcode.slidingwindow.hard.slidingwindowmaximum;

import com.alibaba.fastjson.JSON;

/** time complexity O(nk), space: O(1)
 * @author yifeng.liu
 * @date 2019-07-02 09:04
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        //时间复杂度O(nk)，空间复杂度O(1)
        System.out.println(JSON.toJSONString(maxSlidingWindow(nums,k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int maxArr[] = new int[nums.length - k + 1];

        if (nums.length == 0 || 0 == k) {
            return nums;
        }


        int idx = 0;
        int init  = k-1;
        for (int i = init; i < nums.length; i++) {
            maxArr[idx] = getMax(nums, i - k + 1, i);
            idx++;
        }
        return maxArr;
    }

    /**
     * 确定一个窗口中最大数
     * @param nums
     * @param start
     * @param end
     * @return
     */
    static int getMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
