public class buyAndSellStocks {
    public static void main(String[] args) {
        int curr[]={7,1,5,3,6,4};

int buy=Integer.MAX_VALUE;
int maxProfit=0;

for(int i=0;i<curr.length;i++){
    if(buy<curr[i]){
        int profit=curr[i]-buy;
        maxProfit=Math.max(maxProfit, profit);
        
    }
    else
    {
        buy=curr[i];
    }


}

System.out.println(maxProfit);
    }
}
