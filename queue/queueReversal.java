package queue;
import java.util.*;

public class queueReversal {
    public static void main(String[] args) {
        

Queue<Integer> q1=new LinkedList<>();
Stack<Integer> s1=new Stack<>();

for(int i=1;i<=10;i++){
    q1.add(i);
}

while(!q1.isEmpty()){
    s1.push(q1.remove());
}

while(!s1.isEmpty()){
    q1.add(s1.pop());
}



while(!q1.isEmpty()){
    System.out.print(q1.peek()+" ");
    q1.remove();
}








    }
}
