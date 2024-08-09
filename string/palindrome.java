package string;

public class palindrome {
    public static void main(String[] args) {
        String a="noon";
        boolean palindrome=true;
        for(int i=0;i<a.length()/2;i++){
            int n=a.length();
            if(a.charAt(i)!=a.charAt(n-1-i)){
                palindrome=false;
            }
           
        }

        if(palindrome==true){
            System.out.println("STRING IS PALINDROME");
        }
        else{
            System.out.println("STRING IS NOT PALINDROME");
            
        }




    }
}
