package Inheritance;

public class Vehicle {
    public void display(){
        System.out.println("this is parent class");
    }
}

class Car extends Vehicle{
    public void data(){
        System.out.println("This is child class");
    }
}

class Bike extends Car{
    public void myBike(){
        System.out.println("This is another child");
    }
}