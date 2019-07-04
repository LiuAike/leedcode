package com.github.leedcode.array.easy.missingnumber;

/**
 * @author yifeng.liu
 * @date 2019-07-04 15:16
 */
public class MissingNumber {

    public static void main(String[] args) {
        /**
         * 题意：
         *      给定一个0, 1, 2, ..., n的无序数组，找出漏掉了那个元素
         *
         *  解题思路：
         *      利用等差数列求和
         *      第一步：求出给定数组的总和{0，1，2，3，5，6，7，8，9}，缺了4
         *      第二部：求出理想状态下到n的和，即{0，1，2，3，4，5，6，7，8，9}
         *      第三步：两个结果相减就得出了漏掉元素的值了
         *
         *   时间和空间：
         *      Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
         *      Memory Usage: 39.1 MB, less than 99.41% of Java online submissions for Missing Number.
         */
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
        }

        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
