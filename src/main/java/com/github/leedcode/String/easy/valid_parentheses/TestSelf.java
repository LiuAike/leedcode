package com.github.leedcode.String.easy.valid_parentheses;

/**
 * @author yifeng.liu
 * @date 2019-07-04 09:47
 */
public class TestSelf {
    public static void main(String[] args) {

        System.out.println("分析结果：" + isValid("([])"));
    }

    public static boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()","").replace("[]","").replace("{}","");
        }while (length != s.length());
            return s.length() == 0;
    }
}
