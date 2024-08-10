package string;

public class shortestPath {
    public static void main(String[] args) {
        
String direction="WNEENESENNN";
int x=0;
int y=0;
for(int i=0;i<direction.length();i++){
if(direction.charAt(i)=='N'){
y++;
}
else if(direction.charAt(i)=='S'){

    y--;
}
else if(direction.charAt(i)=='E'){
    x++;

}
else{
    x--;
}

    }


    int x2=x*x;
    int y2=y*y;


    double shortestPath=Math.sqrt(x2+y2);
    System.out.println(shortestPath);



}
}