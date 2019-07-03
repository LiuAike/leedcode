package com.github.leedcode.array.easy.besttimetobuyandsellstocks;

/**
 * @author yifeng.liu
 * @date 2019-07-03 13:51
 */
public class TestSelf {
    public static void main(String[] args) {
        //int[] prices = new int[]{7,6,4,3,1};
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= prices[i-1]){
                count++;
            }
        }
        if (prices.length - 1 == count){
            return 0;
        }
        int diff = Integer.MIN_VALUE,max = diff;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > prices[i]){
                    diff = prices[j] - prices[i];
                }
                if (diff > max){
                    max = diff;
                }
            }
        }
        return max;
    }
}
