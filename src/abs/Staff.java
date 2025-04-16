package abs;

public interface Staff {
    void display();

    void draw();
}

class Student implements Staff{
    public void display(){
        System.out.println("This interface from staff");
    }

    public void draw() {
        System.out.println("This is another method from staff");
    }
}

class Main1{
    public static void main(String[] args) {
        Staff s = new Student();
        s.display();
        s.draw();
    }
}