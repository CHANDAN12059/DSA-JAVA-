package string;

public class largestString {
    public static void main(String[] args) {
        
String arr[]={"apple","mango","banana"};

String largest=arr[0];
for(int i=1;i<arr.length;i++){

if(arr[i].compareTo(largest)>0){
    largest=arr[i];
}


}
System.out.println(largest);




    }
}
