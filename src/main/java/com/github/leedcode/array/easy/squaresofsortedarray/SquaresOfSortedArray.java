package com.github.leedcode.array.easy.squaresofsortedarray;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author yifeng.liu
 * @date 2019-07-02 15:23
 */
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] tinit = new int[]{-7, -3, 2, 3, 11};
        //Time Complexity: O(NlogN), where N is the length of A.
        //Space Complexity: O(N).
        System.out.println(JSON.toJSONString(sortedSquares(tinit)));
    }

    public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
