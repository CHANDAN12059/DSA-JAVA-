package queue;

import java.util.*;

public class queueUsingToStacks {
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {

            return s1.isEmpty();

        }

        public void add(int n) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(n);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        public void remove() {

            if (isEmpty()) {
                System.out.println("EMPTY");
                return;
            }

            s1.pop();

        }

        public int peek() {
            return s1.peek();
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
