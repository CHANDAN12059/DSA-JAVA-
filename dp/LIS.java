package dp;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int arr[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }

        int brr[] = new int[h.size()];

        int a = 0;

        for (int element : h) {
            brr[a] = element;
            a++;
        }

        Arrays.sort(brr);

        int dp[][] = new int[brr.length + 1][arr.length + 1];

        for (int k = 0; k < brr.length; k++) {
            dp[k][0] = 0;
        }
        for (int k = 0; k < arr.length; k++) {
            dp[0][k] = 0;
        }

        for (int i = 1; i < brr.length + 1; i++) {
            for (int j = 1; j < arr.length + 1; j++) {
                if (brr[i - 1] == arr[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        System.out.println(dp[brr.length][arr.length]);

    }
}
