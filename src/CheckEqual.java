public class CheckEqual {
    public static void main(String[] args) {
        String name = "oviya";
        String myName = "oviya";
        String str = new String("oviya");

        System.out.println((name==myName));
        System.out.println((name==str));

        System.out.println(name.equals(myName));
        System.out.println(name.equals(str));
    }
}
