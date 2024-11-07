package dp;

public class targetSumSubset {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 10;

        boolean dp[][] = new boolean[arr.length + 1][sum + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j && dp[i - 1][j - arr[i - 1]] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;

                }

            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[arr.length][sum]);

    }
}
