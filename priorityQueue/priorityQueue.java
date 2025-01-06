package priorityQueue;
import java.util.*;

public class priorityQueue {
 public static void main(String[] args) {
    
PriorityQueue<Integer> p=new PriorityQueue<>();

p.add(200);
p.add(1);
p.add(23);
p.add(0);
p.add(100);
p.add(100);

System.out.println(p);

while(!p.isEmpty()){

    System.out.print(p.peek()+" ");
    p.remove();

}







 }   
}
