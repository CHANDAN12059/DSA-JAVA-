package dp;
import java.util.*;

public class climbingStairsMemoization {
    public static int ways(int n,int[] arr){




if(n==0){
    return 1;
}
if(n<0){
    return 0;
}


if(arr[n]!=0){
    return arr[n];
}

arr[n]=ways(n-1,arr)+ways(n-2,arr);
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
