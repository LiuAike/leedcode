package com.github.leedcode.array.easy.rotatearray;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-03 15:47
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(JSON.toJSONString(nums));

    }

    public static void rotate(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length-1];
            for (int j = nums.length - 2; j >= 0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = temp;
        }
    }
}
