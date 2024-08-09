public class duplicate {
    public static void main(String[] args) {
        
int arr[]={12,2,3,12};
boolean found=false;
for(int i=0;i<arr.length-1;i++){
 for(int j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j]){
        found=true;
        break;
    }
 }

}

if(found){
    System.out.println("yes");

}
else{
    System.out.println("no");


}





}}