package dp;
import java.util.*;

public class climbingStairsTabulation {
    public static int ways(int n,int[] arr){

arr[0]=1;
arr[1]=1;



for(int i=2;i<arr.length;i++){
    arr[i]=arr[i-1]+arr[i-2];
}

return arr[n];


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];

        System.out.println(ways(n,arr));

        sc.close();
    }
    
}
