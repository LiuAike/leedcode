package com.github.leedcode.array.easy.besttimetobuyandsellstocks;

/**
 * @author yifeng.liu
 * @date 2019-07-03 13:51
 */
public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        //int[] prices = new int[]{7,6,4,3,1};
        int[] prices = new int[]{7,1,5,3,6,4};
        //解题思路：只要找出数组中的最大值和最小值就好了
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
       int maxProf = 0,y = 0;
        for (int i = 1; i < prices.length; i++) {
            int compare = prices[i] - prices[y];
            if (compare > maxProf){
                maxProf = compare;
            }
            if (prices[i] < prices[y]){
                y = i;
            }
        }
        return maxProf;
    }
}
