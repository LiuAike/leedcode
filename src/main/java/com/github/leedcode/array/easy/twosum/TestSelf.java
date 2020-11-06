package com.github.leedcode.array.easy.twosum;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:16
 */

/**
 * Runtime: 2 ms, faster than 99.27% of Java online submissions for Two Sum.
 * Memory Usage: 36.4 MB, less than 99.39% of Java online submissions for Two Sum.
 * Time complexity : O(n^2)
 * Space complexity : O(1)
 */
public class TestSelf {
    public static void main(String[] args) {
        twoSum(new int[]{1,2,7},9);
        System.out.println(JSON.toJSONString(twoSum(new int[]{1,2,7},9)));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
