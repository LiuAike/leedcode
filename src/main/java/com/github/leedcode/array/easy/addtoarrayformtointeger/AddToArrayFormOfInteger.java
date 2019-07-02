package com.github.leedcode.array.easy.addtoarrayformtointeger;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yifeng.liu
 * @date 2019-07-02 10:27
 */
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] tinit = new int[]{1, 2, 0, 0};
        int k = 34;
        System.out.println(JSON.toJSONString(addToArrayForm(tinit, k)));
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int length = A.length;
        int cur = K;
        int i = length;
        List<Integer> ins = new ArrayList<Integer>();
        while (--i >= 0 || cur > 0){
            if (i >= 0){
                cur += A[i];
            }
            ins.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(ins);
        return ins;
    }
}
