
package search;
public class binarySearch {

public static int BinarySearch(int[] arr,int n){
int start=0;
int end=arr.length-1;

while(start<=end){
    int mid=(start+end)/2;

if(arr[mid]==n){
    return mid;
}
if(n>arr[mid]){
    start=mid+1;
}
else{
    end=mid-1;
}



}



return -1;

}

    public static void main(String[] args){
int num[]={2,3,5,6,7,8,9,23,56};

int index=BinarySearch(num,23);
System.out.println(index);



    }
}
