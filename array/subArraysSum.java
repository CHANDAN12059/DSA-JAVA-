public class subArraysSum {
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
int sum=0;
int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                sum=sum+arr[k];
                }
                System.out.print(sum+" ");
                if(sum>max){
                    max=sum;
                }
            }
        }

System.out.println();
System.out.println("max sum "+max);
    }
}
