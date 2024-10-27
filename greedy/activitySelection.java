package greedy;

import java.util.*;

public class activitySelection {
   public static void main(String[] args) {
        ArrayList<Integer> start=new ArrayList<>();
        ArrayList<Integer> end=new ArrayList<>();
        start.add(1);   start.add(3); start.add(2);start.add(5);
        end.add(2);end.add(4); end.add(3); end.add(6);
       
     
        
    
        int activity[][]=new int[start.size()][2];
        
        
        for(int i=0;i<start.size();i++){
            activity[i][0]=start.get(i);
            activity[i][1]=end.get(i);
        }
        
        Arrays.sort(activity,Comparator.comparingInt(o->o[1]));
        
        
        int max=1;
        int lastEnd=activity[0][1];
        for(int i=1;i<start.size();i++){
            if(activity[i][0]>lastEnd){
                max++;
                lastEnd=activity[i][1];
            }
            
        }
System.out.println(max);  
        
        
        
    }
}
