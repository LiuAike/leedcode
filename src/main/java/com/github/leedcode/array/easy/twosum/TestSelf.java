package com.github.leedcode.array.easy.twosum;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:16
 */
public class TestSelf {
    public static void main(String[] args) {
        twoSum(new int[]{1,2,3,4},3);
        System.out.println(JSON.toJSONString(twoSum(new int[]{1,2,3,4},3)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                result[0] = map.get(tmp);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
