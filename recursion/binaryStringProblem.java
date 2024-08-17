package recursion;

public class binaryStringProblem {
    public static void printBinaryString(int n,int lastPlace,String s){
if(n==0){
    System.out.println(s);
    return;
}
if(lastPlace==0){
printBinaryString(n-1,0, s+"0");
printBinaryString(n-1,1, s+"1");

}
else{
    printBinaryString(n-1,0, s+0);
}
    }
    public static void main(String[] args) {
        printBinaryString(3,0,"");

    }
}
