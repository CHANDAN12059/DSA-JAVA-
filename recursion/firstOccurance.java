package recursion;

public class firstOccurance {
    
public static int search(int[] arr,int key,int i){

if(i==arr.length){
    return -1;
}
if(arr[i]==key){
    return i;
}
return search(arr, key, i+1);


} 

    public static void main(String[] args) {
        int startIndex=0;
        int arr[]={3,23,4,21,4,5};
       System.out.println(search(arr,4,startIndex));
    }
}
