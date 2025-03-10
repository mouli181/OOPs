package Thread;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thred is running");
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
}
