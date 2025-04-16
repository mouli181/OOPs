package generic;

public class GenericsEx {
    public <T> void printArray(T[] a){
        for(T arr : a){
            System.out.println(arr);
        }
    }
}
class Main{
    public static void main(String[] args) {
        GenericsEx g = new GenericsEx();
        Integer[] i = {1,2,3,4,5};
        String[] s = {"welcome"," to java"};
        g.printArray(i);
        g.printArray(s);
    }
}