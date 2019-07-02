package com.github.leedcode.array.easy.duplicatezeros;

import com.alibaba.fastjson.JSON;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yifeng.liu
 * @date 2019-07-02 16:14
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(JSON.toJSONString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i : arr){
            queue.add(i);
        }
        int i = 0;
        while(i <= arr.length - 1) {
            int top = queue.poll();
            if(top != 0) {
                arr[i++] = top;
            } else {
                arr[i++] = top;
                if(i > arr.length - 1){
                    return;
                }
                arr[i++] = top;
            }
        }
    }
}
