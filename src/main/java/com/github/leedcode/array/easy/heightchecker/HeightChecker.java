package com.github.leedcode.array.easy.heightchecker;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author yifeng.liu
 * @date 2019-07-02 16:53
 */
public class HeightChecker {
    public static void main(String[] args) {
        int[] tint = new int[]{1,1,4,2,1,3};
        System.out.println(JSON.toJSONString(heightChecker(tint)));
    }

    public static int heightChecker(int[] heights) {
        int [] sorted = heights.clone();
        Arrays.sort(sorted);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(sorted[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

}
