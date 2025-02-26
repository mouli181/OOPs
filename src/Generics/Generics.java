package Generics;

public class Generics {

    public <T> void display(T[] a){
        for(T b : a){
            System.out.println(b);
        }
    }
}

class Mainex{
    public static void main(String[] args) {
        Generics g = new Generics();
        Integer[] numbers = {1,2,3,4,5};
        g.display(numbers);
        String[] str = {"Hello","welcome"};
        g.display(str);
    }
}
