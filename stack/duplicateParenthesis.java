package stack;

import java.util.*;

public class duplicateParenthesis {
    public static boolean isDuplicate(String a) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);

            if (ch != ')') {
                s.push(ch);
            } else {

                int cnt = 0;

                while (s.peek() != '(') {
                    s.pop();
                    cnt++;
                }
                if (cnt < 1) {
                    return true;
                } else {
                    s.pop();
                }

            }

        }
        return false;

    }

    public static void main(String[] args) {

        String a = "((a+b))";

        System.out.println(isDuplicate(a));
    }

}
