package dp;

public class Knapsack01 {
    public static int max(int[] val,int[] wt,int capacity,int i){


        if(capacity==0||i==0){
            return 0;
        }

        if(wt[i-1]<=capacity){
            int ans1=val[i-1]+max(val,wt,capacity-wt[i-1],i-1);
            int ans2=max(val,wt,capacity,i-1);
            return Math.max(ans1,ans2);
        }
        else{
            return max(val,wt,capacity,i-1);
        }





    }
    public static void main(String[] args) {
        
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;

        int maximum=max(val,wt,w,val.length);
        System.out.println(maximum);
    }
    
}
