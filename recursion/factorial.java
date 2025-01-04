package recursion;

public class factorial {

    public static int print( int x, int n) {
    
if(n==0){
    return 1;
}


int even=x*print(x,n-1);

return ans;

    }

    public static void main(String[] args) {

        
        System.out.println(print(2,3));

    }
}
