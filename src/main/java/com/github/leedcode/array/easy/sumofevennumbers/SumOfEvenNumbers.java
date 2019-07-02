package com.github.leedcode.array.easy.sumofevennumbers;

/**
 * @author yifeng.liu
 * @date 2019-07-02 15:52
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //Time Complexity: O(N+Q), where N is the length of A and Q is the number of queries.
        //Space Complexity: O(Q), though we only allocate O(1) additional space.
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int S = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                S += x;
            }
        }
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index];
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index];
            ans[i] = S;
        }

        return ans;
    }
}
