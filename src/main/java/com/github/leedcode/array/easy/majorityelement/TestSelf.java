package com.github.leedcode.array.easy.majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yifeng.liu
 * @date 2019-07-03 15:05
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                Integer integer = map.get(nums[i]);
                map.put(nums[i], ++integer);
            }
        }
        int max = 0,value = 0;

        for (Integer i : map.keySet()) {
            if (max < map.get(i)) {
                max = map.get(i);
                value = i;
            }
        }
        if (max > nums.length / 2){
            return value;
        }

        return value;
    }
}
