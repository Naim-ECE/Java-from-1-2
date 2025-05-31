import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.print("Enter a string: ");
        a = scan.nextLine();
        Palindrome p = new Palindrome();
        if (p.Pro37(a))
            System.out.println("\'" + a + "\' is a palindrome");
        else
            System.out.println("\'" + a + "\' is not a palindrome");
    }
}
class Palindrome {
    static boolean Pro37(String b) {
        if(b == null || b.length() <= 1)
            return true;
        if(b.charAt(0) != b.charAt(b.length() - 1))
            return false;
        return Pro37(b.substring(1, b.length() - 1));
    }
}