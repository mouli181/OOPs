package InhertitanceTypes.Single;

public class Animal {
    void makesound(){
        System.out.println("animal");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}

