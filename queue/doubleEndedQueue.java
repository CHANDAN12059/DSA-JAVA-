package queue;

import java.util.*;

public class doubleEndedQueue {
    public static void main(String[] args) {
        
    Deque<Integer> q=new LinkedList<>();

    q.addFirst(1);
    q.addFirst(2);
    q.addLast(3);
    q.removeFirst();
    q.removeAll(q);


    while(!q.isEmpty()){

System.out.println(q.peek());
q.remove();

    }





    }
}
