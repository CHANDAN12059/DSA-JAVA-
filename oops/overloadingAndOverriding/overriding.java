package oops.overloadingAndOverriding;

class Animal{

    void eat(){
        System.out.println("Animal eating");
    }
}

class Deer extends Animal{
void eat(){
System.out.println("Deer eating");
}

}



public class overriding {
    public static void main(String[] args) {
        Animal a=new Animal();
        Deer b=new Deer();
        a.eat();
        b.eat();
    }
}
