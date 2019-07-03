package com.github.leedcode.array.easy.searchinsertposition;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author yifeng.liu
 * @date 2019-07-03 08:54
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,6,7};
        int target = 3;
        System.out.println(JSON.toJSONString(searchInsert(nums,target)));

    }

    public static int searchInsert(int[] nums, int target) {
        int[] result = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                return i;
            }
            result[i] = nums[i];
        }
        result[nums.length] = target;

        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            if (target == result[i]){
                return i;
            }
        }
        return nums.length;
    }
}
