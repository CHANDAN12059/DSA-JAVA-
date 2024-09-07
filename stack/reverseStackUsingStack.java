package stack;
import java.util.*;
public class reverseStackUsingStack {
    public static void main(String[] args) {
        Stack <Integer> a=new Stack<>();
        Stack <Integer> b=new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        
        
        System.out.println("ORIGNAL STACK");
        while(!a.isEmpty()){
            System.out.print(a.peek()+" ");
            b.push(a.pop());
        }
        System.out.println();
        System.out.println("REVERSED STACK");
        while(!b.isEmpty()){
            System.out.print(b.pop()+" ");
        }



    }
}
