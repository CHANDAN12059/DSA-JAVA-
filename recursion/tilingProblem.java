package recursion;

public class tilingProblem {
    public static int noOfWays(int n){

if(n==0||n==1){
    return 1;
}
int h=noOfWays(n-2);
int v=noOfWays(n-1);
return h+v;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(noOfWays(n));
    }
}
