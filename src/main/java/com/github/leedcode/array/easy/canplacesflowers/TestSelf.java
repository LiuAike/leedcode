package com.github.leedcode.array.easy.canplacesflowers;

/**
 * @author yifeng.liu
 * @date 2019-07-05 08:54
 */
public class TestSelf {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;
        /**
         * 题意：
         *      给定一个有0和1组成的数组，插入1，要求两个1之间必须至少有一个0，给你一个n值，
         *      问这个数组能插入n个这样的1吗
         * 解题思路：
         *      遍历数组，对于每一个元素来说，它前面的元素和后面的元素必须都是0，
         *      第一个元素和最后一个元素例外，只要为0就一定能插入一个1
         *
         * 占用时间和空间：
         *      Runtime: 1 ms, faster than 100.00% of Java online submissions for Can Place Flowers.
         *      Memory Usage: 38.6 MB, less than 99.26% of Java online submissions for Can Place Flowers.
         */
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }
}
