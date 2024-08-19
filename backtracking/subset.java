package backtracking;

public class subset {
public static void subsets(String a,int i,String sub){
    
if(i==a.length()){
    if(sub.length()==0){
        System.out.println("null");
    }else{

    System.out.print(sub+" ");
    }
    return;

}

subsets(a, i+1, sub+a.charAt(i));
subsets(a, i+1, sub);




}

    public static void main(String[] args) {
        String a="abc";
        int startIndex=0;
        subsets(a,startIndex,"");
    }
}
