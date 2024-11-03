package dp;
import java.util.*;
public class climbingStairsRecursion {
    public static int ways(int n){

        
if(n==0){
    return 1;
}
if(n<0){
    return 0;
}

return ways(n-1)+ways(n-2);





    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(ways(n));


sc.close();

    }
}
