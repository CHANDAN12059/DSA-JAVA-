package Hash;
import java.util.*;


public class hashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        h.add(11111111);
        h.add(2);
        h.add(13);
        h.add(300);
        h.add(13);

        Iterator itr=h.iterator();


        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
