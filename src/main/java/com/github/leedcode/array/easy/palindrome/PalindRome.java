package com.github.leedcode.array.easy.palindrome;

/**
 * @author yifeng.liu
 * @date 2019-07-03 17:21
 */
public class PalindRome {
    public static void main(String[] args) {
        int i = 121;
        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder before = new StringBuilder(String.valueOf(x));
        String after = before.reverse().toString();
        return String.valueOf(x).equals(after);
    }
}
