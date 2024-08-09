package array2d;

public class diagonalSum {
    
public static void main(String[] args) {
    int sum=0;
int arr[][]={

{1,2,3,4},
{5,6,7,8},
{9,10,11,12},
{13,14,15,16}

};

for(int i=0;i<arr.length;i++){
sum+=arr[i][i];


if(i!=arr.length-i-1){
sum+=arr[i][arr.length-1-i];
}

}

System.out.println(sum);


}

}
