public class trappingRainwater {
    public static void main(String[] args) {
        
int arr[]={4,2,0,6,3,2,5};
int left[]=new int[arr.length];
int right[]=new int[arr.length];

left[0]=arr[0];
right[arr.length-1]=arr[arr.length-1];
int trapperWater=0;

for(int i=1;i<arr.length;i++){
    left[i]=Math.max(arr[i],left[i-1]);
}

for(int i=arr.length-2;i>=0;i--){
    right[i]=Math.max(arr[i],right[i+1]);
}


for(int i=0;i<arr.length;i++){
    int waterLevel=Math.min(left[i],right[i]);
    trapperWater=trapperWater+(waterLevel-arr[i]);


}
System.out.println(trapperWater);




    }
}
