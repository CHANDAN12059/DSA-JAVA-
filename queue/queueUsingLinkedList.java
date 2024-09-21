package queue;

public class queueUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {

        public  Node head = null;
        public  Node tail = null;

        public  boolean isEmpty() {

            return head == null;

        }

        public  void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        public void remove() {

            if (isEmpty()) {
                System.out.println("EMPTY QUEUE");
                return;
            }
            if(tail==head){
                head=tail=null;
            }
            else{
            head = head.next;
            }
        }

        public  int peek() {

            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;

        }

    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
