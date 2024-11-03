package dp;

public class knapsack01Memoization {
    public static int max(int[] val, int[] wt, int capacity, int i, int[][] arr) {

        if (i == 0 || capacity == 0) {
            return 0;
        }

        if (arr[i][capacity] != 0) {
            return arr[i][capacity];
        }

        if (wt[i - 1] <= capacity) {

            int ans1 = val[i-1]+max(val, wt, capacity - wt[i - 1], i - 1, arr);
            int ans2 = max(val, wt, capacity, i - 1, arr);
            arr[i][capacity] = Math.max(ans1, ans2);
            return arr[i][capacity];

        } else {
            arr[i][capacity] = max(val, wt, capacity, i - 1, arr);
            return arr[i][capacity];
        }

    }

    public static void main(String[] args) {

        int val[] = { 15, 14, 10, 45, 30 };
        int w = 7;
        int wt[] = { 2, 5, 1, 3, 4 };
        int arr[][] = new int[val.length + 1][w + 1];

        int maximum = max(val, wt, w, val.length, arr);
        System.out.println(maximum);

    }
}
