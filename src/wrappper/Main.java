package wrappper;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        int c = b.intValue();
        System.out.println(c);

        //autoboxing
        int d = 50;
        Integer f = d;
        System.out.println(f);
        //unboxing
        int g = f;
        System.out.println(g);
    }
}
