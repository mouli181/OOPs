package inheri;

public class Parent {
    void parentMoney(){
        System.out.println("parent method");
    }
}


class Child extends Parent {
    void childMoney(){
        System.out.println("Child method");
    }
}

class Main{
    public static void main(String[] args) {
        Child c = new Child();
        c.childMoney();
        c.parentMoney();
    }
}