package greedy;
import java.util.*;

public class chocola {
    public static void main(String[] args) {
        Integer costHor[]={4,1,2};
        Integer costVer[]={2,1,3,1,4};
       

        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());

        int h=0;
        int v=0;
        int hp=1;
        int vp=1;
        int cost=0;



        while(h<costHor.length&&v<costVer.length){
            if(costHor[h]>costVer[v]){
                cost=cost+(costHor[h]*vp);
                h++;
                hp++;
            }
            else{
                cost=cost+(costVer[v]*hp);
                v++;
                vp++;
            }
        }

        while(h<costHor.length){
            cost=cost+(costHor[h]*vp);
            h++;
            hp++;
        }

        while(v<costVer.length){
            cost=cost+(costVer[v]*hp);
            v++;
            vp++;
        }


System.out.println(cost);


    }
}
