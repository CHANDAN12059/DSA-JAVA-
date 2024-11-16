package dp;

public class catalanMemoization {

    public static int find(int n, int arr[]) {

        if (n == 0 || n == 1) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        if (arr[n] != 0) {
            return arr[n];
        }

        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans = ans + find(i, arr) * find(n - i - 1, arr);

        }

        arr[n] = ans;

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n + 1];

        System.out.println(find(n, arr));

    }
}
