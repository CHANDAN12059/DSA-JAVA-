package stack;
import java.util.*;

public class stackUsingCollectionFrameWork {
    public static void main(String[] args) {
        
Stack <Integer> a=new Stack<>();
a.push(120);
a.push(150);
a.push(180);

while(!a.isEmpty()){
    System.out.println(a.peek());
    a.pop();
}




    }
}
