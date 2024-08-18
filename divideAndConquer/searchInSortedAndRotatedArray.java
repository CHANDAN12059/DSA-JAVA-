package divideAndConquer;

public class searchInSortedAndRotatedArray {

public static int find(int[] arr,int target,int si,int ei){

if(si>ei){
    return -1;
}

int mid=si+(ei-si)/2;
if(arr[mid]==target){
    return mid;
}

if(arr[si]<arr[mid]){
if(arr[si]<=target&&target<arr[mid]){
    return find(arr, target, si, mid-1);
    
}else{
    return find(arr, target, mid+1, ei);
}


}
else{
if(arr[mid]<target&&target<=arr[ei]){
    return find(arr, target, mid+1, ei);
}
else{
    return find(arr, target, si, mid-1);
}



}






}


    public static void main(String[] args) {
        int arr[]={5,6,7,8,0,1,2};
        int target=2;
        int si=0;
        int ei=arr.length-1;
        System.out.println(find(arr,target,si,ei));
    }
}
