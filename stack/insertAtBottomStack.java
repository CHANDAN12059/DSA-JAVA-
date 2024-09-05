package stack;

import java.util.*;

public class insertAtBottomStack {

    public static void insertAtBottom(Stack<Integer> s, int n) {

        if (s.isEmpty()) {
            s.push(n);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, n);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        insertAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
