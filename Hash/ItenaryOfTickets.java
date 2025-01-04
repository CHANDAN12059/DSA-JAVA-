package Hash;

import java.util.*;

public class ItenaryOfTickets {

    public static String getStart(HashMap<String, String> h) {

        HashMap<String, String> rev = new HashMap<>();

        for (String key : h.keySet()) {
            rev.put(h.get(key), key);
        }

        for (String key : h.keySet()) {
            if (!rev.containsKey(key)) {
                return key;
            }
        }

        return null;

    }

    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");


      String start=getStart(tickets);
      System.out.print(start);

        for(String key:tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start=tickets.get(start);
        }

    }
}
