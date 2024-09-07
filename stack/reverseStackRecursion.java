package stack;

import java.util.*;

public class reverseStackRecursion {
    public static void pushAtBottom(Stack<Integer> a, int val) {
        if(a.isEmpty()){
            a.push(val);
            return;
        }

        int top=a.pop();
        pushAtBottom(a, val);
        a.push(top);


    }

    public static void reverseStack(Stack<Integer> a) {
        if(a.isEmpty()){
            return;
        }
        int top = a.pop();
        reverseStack(a);
        pushAtBottom(a, top);

    }

    public static void print(Stack<Integer> a){
        while (!a.isEmpty()) {
            System.out.print(a.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        
        reverseStack(a);
        System.out.println("REVERSED STACK");
        print(a);

    

    }
}
