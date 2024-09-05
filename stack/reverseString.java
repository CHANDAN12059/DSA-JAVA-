package stack;
import java.util.*;
public class reverseString {
    public static String  reverse(String a){
Stack<Character> s=new Stack<>();
int i=0;
while(i<a.length()){
    s.push(a.charAt(i));
    i++;
}        



StringBuilder result=new StringBuilder();
while(!s.isEmpty()){
    result.append(s.pop());
}

return result.toString();
    }
    public static void main(String[] args) {
        String a="helloworld";
        System.out.println(reverse(a));
    }
    
}
