package com.github.leedcode.array.easy.fibonaccinumber;

/**
 * @author yifeng.liu
 * @date 2019-07-04 16:53
 */
public class TestSelf {
    public static void main(String[] args) {
        int N = 6;
        /**
         * 题意：
         *      求斐波那契数列第N个数的值
         *
         * 占用时间和空间：
         *      Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
         *      Memory Usage: 33 MB, less than 5.10% of Java online submissions for Fibonacci Number.
         */
        System.out.println(fib(N));
    }

    public static int fib(int N) {
        if (N <= 1){
            return N;
        }

        int F0 = 0,F1 = 1,sum = 0;
        for (int i = 2; i <= N ; i++) {
            sum =  F0+ F1;
            F0 = F1;
            F1 = sum;
        }
        return sum;
    }

    /**
     * 使用递归
     * 占用时间和空间：
     *      Runtime: 8 ms, faster than 34.63% of Java online submissions for Fibonacci Number.
     *      Memory Usage: 32.8 MB, less than 5.10% of Java online submissions for Fibonacci Number.
     * @param N
     * @return
     */
   /* public static int fib(int N) {
        if(N <= 1){
            return N;
        }

        return fib(N-1)+fib(N-2);
    }*/


}
