package com.github.leedcode.stack.removealladjacentduplicatesinstring;

import java.util.Stack;

/**
 * @author yifeng.liu
 * @date 2019-07-04 08:40
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String c = "abbaca";
        //执行效率没有TestSelf效率高
        System.out.println(removeDuplicates(c));

    }

    public static String removeDuplicates(String S) {
        /* 只需删除重复项即可，因此可以使用栈实现
         * 每次添加时比较是否与栈顶元素相同
         *   - 若相同则删除栈顶元素且不插入
         *   - 若不相同则插入新元素
         * 时间复杂度：O(N)
         * 空间复杂度：O(N)
         *  attention:
         *      1、栈中要是没有元素调用stack.peek()方法，会报java.util.EmptyStackException异常
         *      2、peek()：返回栈顶的值但是不改变栈的值，查看栈顶的对象而不移除它。
         *      3、pop()：返回栈顶的值，同时会把栈顶的值删除。
         *
         *  时间和占用空间：
         *      Runtime: 39 ms, faster than 55.83% of Java online submissions for Remove All Adjacent Duplicates In String.
         *      Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
         */
        char[] s = S.toCharArray();
        int len = s.length;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < len; i++) {
            if ( stack.isEmpty() || s[i] != stack.peek()) {
                stack.push(s[i]);
            } else {
                stack.pop();
            }
        }
        /* 数据的展示可以继续优化 */
        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }

        return str.toString();

    }
}
