package Hash;
import java.util.*;

import recursion.isSorted;

public class hashmap {
    public static void main(String[] args) {
        
HashMap<String,Integer> h=new HashMap<>();

h.put("india",100);
h.put("china",200);
h.put("USA",300);
h.put("india",400);

// h.remove("USA");
// boolean contains=h.containsKey("chinas");
// h.clear();
// boolean empty=h.isEmpty();
// System.out.println(h);


// Set<String> s=h.keySet();
// System.out.println(s);

for(String val:h.keySet()){
    System.out.print(val+" "+h.get(val));
}



    }
}
