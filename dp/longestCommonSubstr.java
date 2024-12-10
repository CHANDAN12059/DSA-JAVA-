// package dp;


// class Solution {
//    public static void main(String[] args) {
    
   
//       String s1 = "ABCDGH"; 
//       String s2 = "ACDGHR";
//      int[][] dp=new int[s1.length()+1][s2.length()+1];
//      int ans=0;
  
     
//      for(int i=1;i<s1.length()+1;i++){
//          for(int j=1;j<s2.length()+1;j++){
//              if(s1.charAt(i-1)==s2.charAt(j-1)){
//                  dp[i][j]=dp[i-1][j-1]+1;
//                  ans=Math.max(ans,dp[i][j]);
//              }
//              else{
//                  dp[i][j]=0;
//              }
//          }
//      }
     
     
     
     
//      System.out.println(ans);
     
     
//     }
// }
