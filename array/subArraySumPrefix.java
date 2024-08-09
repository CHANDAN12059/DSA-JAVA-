public class subArraySumPrefix {
    public static void main(String[] args) {
        
        int arr[]={1,-2,6,-1,3};
int max=Integer.MIN_VALUE;
int sum=0;
int prefix[]=new int[arr.length];
prefix[0]=arr[0];
for(int a=1;a<arr.length;a++){
    prefix[a]=prefix[a-1]+arr[a];}



    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
if(sum>max){
    max=sum;
}
        }
    }





System.out.println(max);


    }
}
