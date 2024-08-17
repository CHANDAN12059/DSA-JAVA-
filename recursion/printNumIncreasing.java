package recursion;

public class printNumIncreasing {

    public static void print(int num){
        if(num==1){
            System.out.println(num);
        return;    
        }
       print(num-1);
       System.out.println(num);


    }


    public static void main(String[] args) {
        int num=10;
        print(num);
    }
}
