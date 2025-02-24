public class PassByRef {
    public static void main(String[] args) {
        PassByRefMain p = new PassByRefMain(10);
        modify(p);
        System.out.println(p.value);
    }
    public static void modify(PassByRefMain p){
        p.value = 15;
    }
}
