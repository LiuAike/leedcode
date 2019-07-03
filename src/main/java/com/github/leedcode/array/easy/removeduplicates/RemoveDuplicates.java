package com.github.leedcode.array.easy.removeduplicates;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-03 10:44
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ins = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(JSON.toJSONString(removeDuplicates(ins)));
    }

    public static int removeDuplicates(int[] nums) {

        int length = nums.length;

        if(length == 0) {
            return 0;
        }
        int i;
        int targetIndex = 1;
        int OG = nums[0];

        for(i = 1; i < length; i++){

            if(nums[i] != OG){

                OG = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        System.out.println(JSON.toJSONString(nums));
        return targetIndex;
    }
}
