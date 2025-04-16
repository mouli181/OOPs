package abs;

abstract class Abstraction {
    abstract void draw();

    void display(){
        System.out.println("welcome to abstract");
    }
}

class Shape extends Abstraction{
    void draw(){
        System.out.println("drawing a cricle");
    }
}

class Main{
    public static void main(String[] args) {
        Abstraction a = new Shape();
        a.display();
        a.draw();
    }
}
