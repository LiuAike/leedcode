package com.github.leedcode.array.easy.reverseinteger;

/**
 * @author yifeng.liu
 * @date 2019-05-30 09:35
 */
public class TestSelf {
    public static void main(String[] args) {
        System.out.println(reverse(-100));
    }
    public static int reverse(int x) {
        try{
            StringBuilder stringBuilder = null;
            int result = 0;
            if (x < 0){
                stringBuilder = new StringBuilder(Math.abs(x) + "-");
            }else {
                stringBuilder = new StringBuilder(String.valueOf(x));
            }
            result = Integer.parseInt(stringBuilder.reverse().toString());
            return result;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
