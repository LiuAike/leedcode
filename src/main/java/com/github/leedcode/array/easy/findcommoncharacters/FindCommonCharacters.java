package com.github.leedcode.array.easy.findcommoncharacters;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yifeng.liu
 * @date 2019-07-02 13:33
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] str = new String[]{"bella","label","roller"};
        System.out.println(JSON.toJSONString(commonChars(str)));
    }

    public static List<String> commonChars(String[] A) {
        ArrayList<String> ans = new ArrayList<String>();
        for (char c : A[0].toCharArray()) {
            ans.add("" + c);
        }
        for (int i = 1; i < A.length; i++) {
            ArrayList<String> temp = new ArrayList<String>();
            for (char c : A[i].toCharArray()) {
                if (ans.contains("" + c)) {
                    ans.remove("" + c);
                    temp.add("" + c);
                }
            }
            ans = temp;
        }
        return ans;
    }
}
