package abstraction;

abstract class Shape {

    abstract void circle();

    void draw(){
        System.out.println("concrete method");
    }
}

class Triangle extends Shape {
    void circle(){
        System.out.println("abstract method definition");
    }
}