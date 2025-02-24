package Polymorphism;

public class Animal {

    void sound(){
        System.out.println("animal make sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
