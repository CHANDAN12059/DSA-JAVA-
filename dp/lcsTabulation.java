package dp;

public class lcsTabulation {
    public static void main(String[] args) {
        
String a="abcde";
String b="ace";
int dp[][]=new int[a.length()+1][b.length()+1];


for(int i=0;i<a.length()+1;i++){
    dp[i][0]=0;
}

for(int i=0;i<b.length()+1;i++){
    dp[0][i]=0;
}


for(int i=1;i<a.length()+1;i++){
    for(int j=1;j<b.length()+1;j++){
if(a.charAt(i-1)==b.charAt(j-1)){
    dp[i][j]=dp[i-1][j-1]+1;
}
else{
    int ans1=dp[i-1][j];
    int ans2=dp[i][j-1];
    dp[i][j]=Math.max(ans1,ans2);
}




    }
}









System.out.println(dp[a.length()][b.length()]);







    }
}
