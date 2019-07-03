package com.github.leedcode.array.easy.besttimetobuyandsellstocks;

/**
 * @author yifeng.liu
 * @date 2019-07-03 13:51
 */
public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        //int[] prices = new int[]{7,6,4,3,1};
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProf = 0, j = 0;
        for (int i = 1; i < prices.length; i ++){
            int compare = prices[i] - prices[j];
            if(compare > maxProf){
                maxProf = compare;
            }
            if(prices[i] < prices[j]){
                j = i;
            }
        }
        return maxProf;
    }
}
