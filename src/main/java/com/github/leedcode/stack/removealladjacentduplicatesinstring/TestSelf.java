package com.github.leedcode.stack.removealladjacentduplicatesinstring;

/**
 * @author yifeng.liu
 * @date 2019-07-04 09:07
 */
public class TestSelf {
    public static void main(String[] args) {
        String c = "abbaca";
        System.out.println(removeDuplicates(c));

    }

    public static String removeDuplicates(String S) {

        /**
         * 占用时间和空间：
         *         Runtime: 6 ms, faster than 93.02% of Java online submissions for Remove All Adjacent Duplicates In String.
         *         Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
         */
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for(char character : S.toCharArray()) {
            if (sbLength != 0 && character == sb.charAt(sbLength - 1)){
                sb.deleteCharAt(sbLength-- - 1);
            } else {
                sb.append(character);
                sbLength++;
            }
        }
        return sb.toString();
    }

}
