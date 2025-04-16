package poly;

public class Shape {
    void draw(){
        System.out.println("shape class");
    }
}

class Circle extends Shape{
    void draw(){
        super.draw();
        System.out.println("this is circle class");
    }
}

 class Main{
     public static void main(String[] args) {
         Shape s = new Circle();
         s.draw();
     }
 }