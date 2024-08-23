package backtracking;

public class gridWaysOptimize {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int fact=n*fact(n-1);
        return fact;



    }
    public static void main(String[] args) {
        
int n=3;
int m=3;
int f1=fact(((n-1)+(m-1)));
int f2=fact(n-1);
int f3=fact(m-1);
int ways=(f1)/(f2*f3);
System.out.println(ways);








    }
}
