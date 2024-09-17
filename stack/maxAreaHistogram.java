package stack;

import java.util.*;

public class maxAreaHistogram {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // NEXT RIGHT SMALLER

        int[] arr = { 2,1,5,6,2,3 };

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                right[i] = arr.length;
            } else {
                right[i] = s.peek();
            }
            s.push(i);

        }

        // NEXT LEFT SMALLER
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = s.peek();
            }
            s.push(i);

        }

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {

            int height = arr[i];
            int width = right[i] - left[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);

        }

        System.out.println(maxArea);

    }
}
