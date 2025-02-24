package Polymorphism;

public class Addition {

    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(10.5,9.5);
        a.add(10,20);
    }

}
