package stack;
import java.util.*;
public class stackUsingDeque {


public static class stack{
    Deque<Integer> q=new LinkedList<>();

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public void push(int n){

q.addFirst(n);


    }

    public void pop(){
        if(q.isEmpty()){
            return;
        }
        q.removeFirst();
    }


    public int peek(){
        return q.peekFirst();
    }








}

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);


        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    





    }
}
