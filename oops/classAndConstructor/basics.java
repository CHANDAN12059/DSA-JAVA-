package oops.classAndConstructor;

class Pen{
private String color;
int tip;


public void setColor(String color){
    this.color=color;
}

public String getColor(){
return this.color;
}

}
public class basics {
    public static void main(String[] args) {
        Pen a=new Pen();
        a.setColor("green");
       System.out.println(a.getColor()); 
        



        
    }
}
