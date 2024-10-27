package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        int capacity=w;
        int finalValue=0;

        double ratio[][]=new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)(val[i]/weight[i]);
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        for(int i=val.length-1;i>=0;i--){
            int index=(int)ratio[i][0];
            if(capacity>=weight[index]){
            finalValue+=val[index];    
            capacity=capacity-weight[index];
            }
            else{

                finalValue=finalValue+((int)ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }

        




System.out.println(finalValue);




    }
}
