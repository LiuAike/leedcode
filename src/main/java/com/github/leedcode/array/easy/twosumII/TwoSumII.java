package com.github.leedcode.array.easy.twosumII;

import com.alibaba.fastjson.JSON;

/**
 * @author yifeng.liu
 * @date 2019-07-04 09:47
 */
public class TwoSumII {
    public static void main(String[] args) {

        /**
         * 因为数组有序：
         *      第一步：2+15=17 17 > 13,所以15大了，取小一点的7
         *      第二步：2+7=9   9 < 13,所以2小了，取大一点的6
         *      第三部：6+7=13 13==13，数组下标从1开始，所以返回6和7的下标[2,3]
         */
        int[] nums = new int[]{2,6,7,15};
        int target = 13;
        System.out.println(JSON.toJSONString(twoSum(nums,target)));//[2,3]

    }

    public static  int[] twoSum(int[] numbers, int target) {
        for(int i = 0, j = numbers.length -1; i< j;){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[] {i+1,j+1};
            } else if(sum > target){
                j--;
            } else {
                i++;
            }
        }
        return new int[] {-1, -1};
    }
}
