public class WrapperEx {
    public static void main(String[] args) {

        //Autoboxing
       int a = 10;
       Integer b = a;
       System.out.println(b);

       //unboxing
        Integer c = 40;
        int d = c;
        System.out.println(d);


        int e = 30;
        Integer f = Integer.valueOf(e);
        System.out.println(e);
        int g = f.intValue();
        System.out.println(g);
    }
}
