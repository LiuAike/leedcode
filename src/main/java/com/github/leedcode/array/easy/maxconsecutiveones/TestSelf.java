package com.github.leedcode.array.easy.maxconsecutiveones;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author yifeng.liu
 * @date 2019-07-04 16:20
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};
        /**
         * 题意：
         *      给定一个只有0和1组成的数组。找出1连续最多的个数
         *
         * 占用时间和空间：
         *      Runtime: 26 ms, faster than 5.78% of Java online submissions for Max Consecutive Ones.
         *      Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.
         */
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int count = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                if (Objects.nonNull(map.get(1)) && map.get(1) > count){
                    count = map.get(1);
                }
                map.put(1,0);
            }else {
                map.put(1,map.getOrDefault(1,0) + 1);
                if (map.get(1) > count){
                    count = map.get(1);
                }
            }
        }
        return count;
    }
}
