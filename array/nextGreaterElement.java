import java.util.Arrays;

public class nextGreaterElement {
    public static void main(String[] args) {
        
int[] arr={6,8,0,1,3};

for(int i=0;i<arr.length;i++){
    boolean found=false;
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
            arr[i]=arr[j];
            found=true;
            break;
        }
      
    }
    if(found==false){
        arr[i]=-1;
    }
}


System.out.println(Arrays.toString(arr));


    }
}
