package com.github.leedcode.array.easy.searchinsertposition;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-03 08:53
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,6,7};
        int target = 3;
        System.out.println(JSON.toJSONString(searchInsert(nums,target)));

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }

}
