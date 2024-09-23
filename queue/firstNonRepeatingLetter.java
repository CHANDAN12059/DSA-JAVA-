package queue;

import java.util.*;

public class firstNonRepeatingLetter {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        String a = "aabccxb";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            q.add(ch);
            freq[ch - 'a']++;


            while (!q.isEmpty()&&freq[q.peek() - 'a'] > 1) {
                q.remove();
        }

        if (q.isEmpty()) {
            System.out.print("-1"+" ");
        }
        else{
            System.out.print(q.peek()+" ");
        }

        }

    

    }
}
