package stack;

import java.util.*;

public class validParentheses {

    public static boolean isValid(Stack<Character> s, String a) {

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(a.charAt(i));
            }
            else{

                if(s.isEmpty()){
                    return false;
                }
               if((ch==')'&&s.peek()=='(')
               ||(ch=='}'&&s.peek()=='{')
               ||(ch==']'&&s.peek()=='[')){
                s.pop();
               }
               else{
                return false;
               }
              


            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();

        String a = "({[]}())";
        System.out.println(isValid(s, a));

    }
}
