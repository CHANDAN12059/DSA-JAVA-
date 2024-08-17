package recursion;

public class fibonacci {

public static int fibo(int n){
if(n==0||n==1){
    return n;
}
    int ans=fibo(n-1)+fibo(n-2);
    return ans;

}

    public static void main(String[] args) {
        
int num=5;
System.out.println(fibo(num));

    }
}
