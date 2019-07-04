package com.github.leedcode.array.easy.maxconsecutiveones;

/**
 * @author yifeng.liu
 * @date 2019-07-04 16:43
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};

        /**
         * 占用时间和空间：
         *      Runtime: 2 ms, faster than 99.75% of Java online submissions for Max Consecutive Ones.
         *      Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Max Consecutive Ones.
         */
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
                continue;
            }

            count++;
            if (count > max){
                max = count;
            }
        }
        return max;
    }
}
