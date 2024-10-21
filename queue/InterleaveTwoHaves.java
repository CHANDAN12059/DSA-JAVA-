package queue;
import java.util.*;
public class InterleaveTwoHaves {
   public static void main(String[] args) {
    
Queue<Integer> q1=new LinkedList<>();
Queue<Integer> q2=new LinkedList<>();

for(int i=1;i<=10;i++){
    q1.add(i);
}
int size=q1.size();

for(int i=0;i<size/2;i++){
q2.add(q1.remove());
}

while(!q2.isEmpty()){

q1.add(q2.remove());
q1.add(q1.remove());

}



while(!q1.isEmpty()){
    System.out.print(q1.remove()+" ");
}









   } 
}
