package dp;

public class knapsack01Tabulation {
     public static void main(String[] args) {
    
    int val[] = { 15, 14, 10, 45, 30 };
    int capacity = 7;
    int wt[] = { 2, 5, 1, 3, 4 };
    int arr[][] = new int[val.length + 1][capacity + 1];


      
    for(int i=0;i<val.length+1;i++){
        arr[i][0]=0;
    }
    
    for(int i=0;i<capacity+1;i++){
        arr[0][i]=0;
    }
    
    
    for(int i=1;i<val.length+1;i++){
        for(int j=1;j<capacity+1;j++){
            if(wt[i-1]<=j){
                
                int ans1=val[i-1]+arr[i-1][j-wt[i-1]];
                int ans2=arr[i-1][j];
                arr[i][j]=Math.max(ans1,ans2);
            }
            else{
                arr[i][j]=arr[i-1][j];
                
            }
        }
    }
    
    
    
    
    
    
    
    System.out.println(arr[val.length][capacity]);



   } 
}
