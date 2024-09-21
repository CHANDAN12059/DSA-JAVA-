package queue;

public class circularQueue {
    public static class Queue {

        int arr[] = new int[5];
        public static int front;
        public static int rear;
        public static int size;

        Queue() {
            front = -1;
            rear = -1;
            size = arr.length;

        }

        public boolean isEmpty() {

            return front == -1 && rear == -1;

        }

        public boolean isFull() {

            return (rear + 1) % size == front;

        }

public  void add(int n){
    if(isFull()){
        System.out.println("queue is full");
        return;
    }

    if(isEmpty()){
        front=0;
    }

    rear=(rear+1)%size;
    arr[rear]=n;


}

        public void remove() {

            if (isEmpty()) {
                System.out.println("queue is empty");
                return;
            }

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

        }

        public int peek() {

            if (isEmpty()) {
                return -1;
            }

            int top = arr[front];

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
