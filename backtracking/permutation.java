package backtracking;

public class permutation {
    public static void findPermutation(String a,String ans){
        if(a.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<a.length();i++){
            char curr=a.charAt(i);
            String newString=a.substring(0, i)+a.substring(i+1);
            findPermutation(newString, ans+curr);
        }
    }
     public static void main(String[] args) {
        String a="abc";
        findPermutation(a,"");
     }
}
