import java.util.Scanner;

public class MyCar {
    String name;
    int price;

    public MyCar(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("Car name is " + name);
        System.out.println("car price is " + price);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the car name");
        String name = s.nextLine();
        System.out.println("enter the price of the car");
        int price = s.nextInt();
        MyCar m = new MyCar(name,price);
        m.display();
    }
}
