package Generics;

public class GenericEx {
    public <T> void display(T[] a){
        for(T arr : a){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5};
        String[] str = {"Hello","world"};
        Double[] d = {10.5,20.5};

        GenericEx g = new GenericEx();
        g.display(array);
        g.display(str);


    }
}