package recursion;




public class printNumDecreasing {
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

System.out.println(n);
print(n-1);


    }
    public static void main(String[] args) {
        int num=10;
        print(num);
        
    }
}
