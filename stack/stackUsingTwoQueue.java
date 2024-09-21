package stack;

import java.util.*;

public class stackUsingTwoQueue {
    public static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {

            return q1.isEmpty() && q2.isEmpty();

        }

        public void push(int n) {

            if (!q1.isEmpty()) {
                q1.add(n);
            } else {
                q2.add(n);
            }

        }

        public void pop() {

            if (isEmpty()) {
                System.out.println("EMPTY");
                return;
            }

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    int top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }

            } else {

                while (!q2.isEmpty()) {

                    int top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }

            }

        }

        public int peek() {

            if (isEmpty()) {
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {

                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);

                }

            } else {

                while (!q2.isEmpty()) {

                    top = q2.remove();
                    q1.add(top);

                }

            }
            return top;

        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
