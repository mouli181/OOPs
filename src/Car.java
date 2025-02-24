public class Car {
    String name;
    String color;
    int price;

    public Car(String name, String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void display(){
        System.out.println("Car Name " + name);
        System.out.println("Car Color " + color);
        System.out.println("Car Price " + price);
    }
}
