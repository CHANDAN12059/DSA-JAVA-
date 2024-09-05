package stack;

import java.util.*;

public class stackUsingArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public  boolean isEmpty() {
            return list.size() == 0;
        }

        public  void push(int data) {
            list.add(data);
        }

        public int pop() {
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            return top;
        }

        public  int peek() {
              if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
