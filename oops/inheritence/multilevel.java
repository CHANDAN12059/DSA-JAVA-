package oops.inheritence;

class Animal {

    public void eat() {
        System.out.println("eating");
    }

    public void breathe() {
        System.out.println("breathing");
    }
}

class Fish extends Animal {

    public void swim() {
        System.out.println("swimming");
    }

}


class Dog extends Fish{

public void bark(){
    System.out.println("barking");
}


}

public class multilevel {
    public static void main(String[] args) {

      
        Dog dog=new Dog();
        dog.eat();

    }
}
