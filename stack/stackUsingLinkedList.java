package stack;

public class stackUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {

        static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;

            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(100);
        s.push(200);
        s.push(300);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
