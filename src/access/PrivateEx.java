package access;


public class PrivateEx {
    protected void myMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        PrivateEx e = new PrivateEx();
        e.myMethod();
    }
}
