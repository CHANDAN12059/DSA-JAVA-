package dp;
import java.util.*;
public class fibonacciTabulation {
    public static int find(int n,int arr[]){
        arr[0]=0;
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

        System.out.println(find(n,arr));
      


sc.close();

    }
}
