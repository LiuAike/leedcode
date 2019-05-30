package com.github.leedcode.array.easy.movezeroes;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:29
 */
/**
 * 解题思路：首先过滤掉0，然后在数组后面补0
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] tArr = new int[]{0,0,1,0,0,3,4,0};
        moveZeroes(tArr);
        System.out.println(JSON.toJSONString(tArr));
    }

    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pos]= nums[i];
                pos++;
            }
        }
        for( ; pos < nums.length; pos++){
            nums[pos] = 0;
        }
    }
}
