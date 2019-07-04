package com.github.leedcode.array.easy.thirdmaximumnumber;

/**
 * @author yifeng.liu
 * @date 2019-07-04 13:38
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {

        /**
         * 题意：给定一个非空数组，返回数组第三大的数，如果不存在则返回最大数
         *       时间复杂度必须是O(n)
         *
         * 时间和空间复杂度：
         *      Runtime: 0 ms, faster than 100.00% of Java online submissions for Third Maximum Number.
         *      Memory Usage: 36 MB, less than 100.00% of Java online submissions for Third Maximum Number.
         */
        int[] nums = new int[]{1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        if(nums.length<3) {
            int max = Integer.MIN_VALUE;
            for(int n:nums) {
                if(n>max) {
                    max = n;
                }
            }
            return max;
        } else {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            int flag = 0;
            for(int n: nums) {
                if(n==Integer.MIN_VALUE){
                    flag=1;
                }
                if(n>max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if(n>max2 && n!=max1) {
                    max3 = max2;
                    max2 = n;
                } else if(n>max3 && n!=max2 && n!=max1) {
                    max3 = n;
                }
            }
            return max3 == Integer.MIN_VALUE && flag==0 || max2==Integer.MIN_VALUE?max1:max3;
        }
    }
}
