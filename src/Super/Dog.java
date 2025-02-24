package Super;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}
