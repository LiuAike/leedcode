package com.github.leedcode.array.easy.degreeodanarray;

import com.alibaba.fastjson.JSON;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yifeng.liu
 * @date 2019-07-04 10:40
 */
public class DegreeOfAnArray {
    public static void main(String[] args) {

        /**
         * 题意：给出一个非空非0数组，根据出现的最多元素次数来定义”度“，
         *       找出所给数组的所有子集中，”度“相同的最小数组的长度
         *
         * Input: [1, 2, 2, 3, 1]
         * Output: 2
         * Explanation:
         * The input array has a degree of 2 because both elements 1 and 2 appear twice.
         * Of the subarrays that have the same degree:
         * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
         * [2, 2]的”度“等于2，长度最小，所以返回2
         *
         * 解题思路：
         *      第一步：求出给定元素的”度“
         *      第二步：记录相同元素第一次和最后一次出现的下标
         *      第三部：度数相同时，比较满足条件元素下标差的最小值
         */
        int[] nums = new int[]{1, 2, 2, 3, 1};
        System.out.println(JSON.toJSONString(findShortestSubArray(nums)));//[2,3]

    }

    public static int findShortestSubArray(int[] nums) {

        /**
         * 时间和空间占用：
         *      Runtime: 24 ms, faster than 53.32% of Java online submissions for Degree of an Array.
         *      Memory Usage: 40.5 MB, less than 96.63% of Java online submissions for Degree of an Array.
         */
        Map<Integer, Integer> left = new HashMap(16), right = new HashMap(16), count = new HashMap(16);

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null){
                //存储元素第一次出现的下标
                left.put(x, i);
            }
            //存储出现元素最后一次出现的下标
            right.put(x, i);
            //记录每个元素出现的次数
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        //获取给定数组的”度“
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
