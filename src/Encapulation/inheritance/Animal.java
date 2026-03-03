package Encapulation.inheritance;

public class Animal {
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}

class Puppy extends Dog{
    void cry(){
        System.out.println("crying....");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.cry();
    }
}

