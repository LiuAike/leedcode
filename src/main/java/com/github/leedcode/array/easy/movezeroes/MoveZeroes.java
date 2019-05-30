package com.github.leedcode.array.easy.movezeroes;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:24
 */

import com.alibaba.fastjson.JSON;

/**
 * Created by LiuAiKe on 2019/5/29.
 * 解题思路
 * 循环元素，当元素不等于0就和cur 下标的元素交换，然后增加 cur 下标的值，最终就会把所有 0 交换到末尾，把所有非0交换到头部。
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] tArr = new int[]{0,0,1,0,0,3,4,0};
        moveZeroes(tArr);
        System.out.println(JSON.toJSONString(tArr));
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0, cur = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int swap = nums[i];
                nums[i] = nums[cur];
                nums[cur++] = swap;
            }
        }
    }
}
