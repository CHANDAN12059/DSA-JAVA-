package dp;

public class catalanTabulation {
    public static void main(String[] args) {
        
int n=5;
int arr[]=new int[n+1];

arr[0]=1;
arr[1]=1;

for(int i=2;i<=n;i++){
for(int j=0;j<=i-1;j++){
    arr[i]+=arr[j]*arr[i-1-j];
}

}

System.out.println(arr[n]);

    }
}
