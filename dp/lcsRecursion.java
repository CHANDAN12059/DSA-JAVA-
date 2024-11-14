package dp;

public class lcsRecursion {
    public static int lcs(String a, String b, int i, int j, int dp[][]) {

        if (i == 0 || j == 0) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        if (a.charAt(i - 1) == b.charAt(j - 1)) {

            dp[i][j] = lcs(a, b, i - 1, j - 1, dp) + 1;
            return dp[i][j];

        } else {
            int ans1 = lcs(a, b, i - 1, j, dp);
            int ans2 = lcs(a, b, i, j - 1, dp);
            dp[i][j] = Math.max(ans1, ans2);
            return dp[i][j];
        }

    }

    public static void main(String[] args) {

        String a = "abcde";
        String b = "ace";
        int i = a.length();
        int j = b.length();
        int dp[][] = new int[a.length() + 1][b.length() + 1];

        System.out.println(lcs(a, b, i, j, dp));

    }
}
