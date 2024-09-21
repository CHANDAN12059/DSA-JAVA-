package queue;

public class queueUsingArray {
    public static class queue {
        static int arr[] = new int[5];
        static int rear;
        static int size;

        public queue() {
            rear = -1;
            size = arr.length;
        }

        public boolean isEmpty() {

            return rear == -1;

        }

        public void add(int n) {

            if (rear == size - 1) {
                System.out.println("full");
                return;
            }

            rear = rear + 1;
            arr[rear] = n;
        }

        public  void remove() {

            if (rear == -1) {
                System.out.println("emoty");
                return;
            }

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear = rear - 1;

        }

        public  int peek() {

            if (rear == -1) {
                System.out.println("emoty");
                return -1;
            }

            int top = arr[0];
            return top;

        }

    }

    public static void main(String[] args) {
        queue q=new queue();
   
        q.add(1);
        q.add(2);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}