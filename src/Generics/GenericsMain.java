package Generics;

public class GenericsMain {

    public <T> void display(T value) {
        System.out.println(value);
    }
}

class Main1 {
        public static void main(String[] args) {
            GenericsMain g = new GenericsMain();
            g.display(10);           // Integer
            g.display("Hello");      // String
            g.display(3.14);         // Double
        }
    }


