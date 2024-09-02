package LinkedList;
import java.util.*;
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(100);
        ll.addLast(200);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        
    }
}
