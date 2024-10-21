package queue;

import java.util.*;

public class queueUsingDeque {
    public static class queue {
        Deque<Integer> q = new LinkedList<>();

        public boolean isEmpty() {
            return q.isEmpty();
        }

        public void add(int n) {

            q.addLast(n);

        }

        public void remove() {
            if (q.isEmpty()) {
                return;
            }
            q.removeFirst();
        }

        public int peek() {
            if (q.isEmpty()) {
                return -1;
            }
            return q.peekFirst();
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
