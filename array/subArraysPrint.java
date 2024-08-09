public class subArraysPrint {
    public static void main(String[] args) {
        int count=0;
   
int arr[]={2,4,6,8,10};
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        for(int k=i;k<=j;k++){
            System.out.print(arr[k]+" ");
      
        }
        count++;
System.out.println();
    }
    System.out.println();
}




System.out.println(count+" ");



    }
}
