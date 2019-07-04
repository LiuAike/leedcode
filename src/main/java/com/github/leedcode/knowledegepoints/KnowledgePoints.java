package com.github.leedcode.knowledegepoints;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * 知识积累
 *
 * @author yifeng.liu
 * @date 2019-07-02 15:14
 */
public class KnowledgePoints {
    public static void main(String[] args) {

        //1、对数组进行排序，string和int都可以
        int[] tint = new int[]{-1, -2, 8, 4};
        Arrays.sort(tint);
        System.out.println(JSON.toJSONString(tint));//[-2,-1,4,8]

        String[] str = new String[]{"b", "a", "c"};
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

        //sb.deleteCharAt(1);根据坐标删除对应的元素，返回删除后生于元素组成的字符串
        //可以用于相邻重复元素删除
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c");
        sb.deleteCharAt(1);
        System.out.println(sb.toString());//ac

        //使用Collections获取一个集合中的最大值或者最小值
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        count.put(1, 1);
        count.put(2, 2);
        count.put(3, 3);
        System.out.println(Collections.max(count.values()));//3
        System.out.println(Collections.max(count.keySet()));//3huo
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        System.out.println(Collections.max(arr));//2
        System.out.println(Collections.min(arr));//1

        //注意map.getOrDefault的使用
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(JSON.toJSONString(map));//{0:1,1:1,2:1,3:1,4:1,5:1,6:1,7:1,8:1,9:1}


    }
}
