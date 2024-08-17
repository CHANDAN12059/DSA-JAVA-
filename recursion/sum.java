package recursion;

public class sum {

    public static int printSum(int n){
        int sum;
        if(n==1){
            return 1;
        } 
 sum=n+printSum(n-1);
 return sum;

    }
    public static void main(String[] args) {
        
int num=5;
System.out.println(printSum(num));



    }
}
