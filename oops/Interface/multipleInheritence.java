package oops.Interface;


interface Herbivore{
    void eat();
 

}
interface Carnivore{
    void walk();

}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("walking");
    }

}



public class multipleInheritence {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eat();
        b.walk();
        
    }
}
