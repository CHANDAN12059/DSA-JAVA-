package oops.abstractClass;

abstract class Animal {
    String color;
    Animal(){
        System.out.println("ANIMAL CONSTRUCTOR");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("HORSE CONSTRUCTOR");
    }

    void walk() {
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("CHICKEN CONSTRUCTOR");
    }

    void walk() {
        System.out.println("Chicken is walking");
    }

}

public class abstractClass {
    public static void main(String[] args) {
       

        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.walk();
      

    }
}
