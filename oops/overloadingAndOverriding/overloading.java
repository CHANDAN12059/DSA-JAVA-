package oops.overloadingAndOverriding;

class Sum{


void sum(int a,int b){
    System.out.println(a+b);
}

void sum(float a,float b){
    System.out.println(a+b);
}
void sum(int a,int b,int c){
    System.out.println(a+b+c);
}

}



public class overloading {
    public static void main(String[] args) {
        Sum a=new Sum();
        a.sum(1,2,3);
        a.sum(1.2f,3.5f);
        
    }
}
