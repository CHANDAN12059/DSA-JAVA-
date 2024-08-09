

class array{
    public static int  max(int []arr){
        int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
    max=arr[i];
}



    }
    return max;
}

public static void main(String[] args){
int number[]={1,222,32,4,32,54,12,3,5};
int index=max(number);
System.out.println(index);



}







}
