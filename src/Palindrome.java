import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();

        boolean b = palindrome(str);

        if(b){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
    public static boolean palindrome(String str){

        str = str.toLowerCase();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
}
