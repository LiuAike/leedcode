package com.github.leedcode.array.easy.findallnumbersdisappearedinanarray;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yifeng.liu
 * @date 2019-07-04 15:32
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        /**
         * 题意：
         *      Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
         *      Find all the elements of [1, n] inclusive that do not appear in this array.
         *      Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
         *      注意不能占用额外的空间，返回List不算
         *
         * 解题思路：
         *      因为数组中的元素最大不会超过数组的长度，所以数组中的元素和下标是有关系的,
         *      调用TAG处理之后，哪些元素缺失，则对应下标的元素不会被修改，根据这些没有修改的元素下标
         *      就能查出缺失的元素。[-4,-3,-2,-7,8,2,-3,-1],8和2元素没有被修改
         */
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(JSON.toJSONString(findDisappearedNumbers(nums)));//[5,6]
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums==null || nums.length==0){
            return result;
        }
        //TAG
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                continue;
            }
            nums[index] = -nums[index];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
