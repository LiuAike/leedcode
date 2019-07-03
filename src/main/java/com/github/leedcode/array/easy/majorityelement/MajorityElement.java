package com.github.leedcode.array.easy.majorityelement;

/**
 * @author yifeng.liu
 * @date 2019-07-03 15:31
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        //解题思路是majority元素的数量超过一般，是加1，不是减1，最后剩下的一定是majority元素
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if (count==0){
                major = nums[i];
            }
            if (major == nums[i]){
                count++;
            } else{
                count--;
            }
        }
        return major;

    }
}
