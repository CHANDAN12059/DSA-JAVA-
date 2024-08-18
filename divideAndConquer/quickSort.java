package divideAndConquer;

public class quickSort {

    public static void sorted(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        sorted(arr, si, pIdx - 1);
        sorted(arr, pIdx + 1, ei);

    }

    public static int partition(int[] arr, int si, int ei) {

        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= arr[ei]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 9,1,4,3,2,5};
        int si = 0;
        int ei = arr.length - 1;
        sorted(arr, si, ei);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
