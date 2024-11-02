package dp;
import java.util.*;
public class fibonacciMemoization {
    public static int fibo(int n,int[] arr){

  if(n==0||n==1){
    return n;
        }

if(arr[n]!=0){
    return arr[n];
}

arr[n]=fibo(n-1,arr)+fibo(n-2,arr);

return arr[n];


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
    System.out.println(fibo(n,arr));
    sc.close();

    }
}
