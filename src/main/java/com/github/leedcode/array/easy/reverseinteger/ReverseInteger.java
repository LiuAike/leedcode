package com.github.leedcode.array.easy.reverseinteger;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:33
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-100));
    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
