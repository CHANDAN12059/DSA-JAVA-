package stack;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }

        System.out.println(Arrays.toString(nextGreater));

    }
}
