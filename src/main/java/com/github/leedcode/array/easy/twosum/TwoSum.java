package com.github.leedcode.array.easy.twosum;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-05-29 18:27
 */

/**
 * Runtime: 14 ms, faster than 44.24% of Java online submissions for Two Sum.
 * Memory Usage: 36.9 MB, less than 99.29% of Java online submissions for Two Sum.
 *
 * 复杂性分析
 * 时间复杂度： O（n ^ 2）。对于每个元素，我们尝试通过循环遍历其余的数组来找到它的补码O（n）时间。因此，时间复杂度是O（n ^ 2）
 * 空间复杂度： O（1）。
 */
public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{1,2,7},9);
        System.out.println(JSON.toJSONString(twoSum(new int[]{1,2,7},9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
