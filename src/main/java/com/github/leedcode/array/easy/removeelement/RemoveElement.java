package com.github.leedcode.array.easy.removeelement;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-05-30 10:01
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,5,6,7,2,3,3,3};
        int single = 7;
        System.out.println(removeElement(nums,single));
        System.out.println(JSON.toJSONString(nums));
    }

    public  static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
