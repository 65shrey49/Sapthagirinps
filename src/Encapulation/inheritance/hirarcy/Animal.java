package Encapulation.inheritance.hirarcy;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("barking....");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("meow....");
    }
}

class Driver {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
