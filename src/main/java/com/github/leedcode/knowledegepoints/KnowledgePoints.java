package com.github.leedcode.knowledegepoints;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 知识积累
 * @author yifeng.liu
 * @date 2019-07-02 15:14
 */
public class KnowledgePoints {
    public static void main(String[] args) {

        //1、对数组进行排序，string和int都可以
        int[] tint = new int[]{-1,-2,8,4};
        Arrays.sort(tint);
        System.out.println(JSON.toJSONString(tint));//[-2,-1,4,8]

        String[] str = new String[]{"b","a","c"};
        Arrays.sort(str);
        System.out.println(JSON.toJSONString(str));//["a","b","c"]


        //2、对list中的元素进行反转
        List<Integer> ins = new ArrayList<Integer>();
        ins.add(1);
        ins.add(4);
        ins.add(3);
        ins.add(7);
        Collections.reverse(ins);
        System.out.println(JSON.toJSONString(ins));//[7,3,4,1]
    }
}
