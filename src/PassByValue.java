public class PassByValue {
    public static void main(String[] args) {
        int a = 10;
        modify(a);
        System.out.println(a);
    }

    private static void modify(int a) {
        a = 15;
    }
}
