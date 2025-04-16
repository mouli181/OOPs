package encaps;

public class Bank {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
}

class Main{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(20000);
        System.out.println("Your acccount balance is "+b.getBalance());
    }
}