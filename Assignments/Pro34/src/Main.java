import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a;
        System.out.print("Enter a positive number: ");
        a = scan.nextLong();
        Factorial fct = new Factorial();
        if(a > 0) {
            System.out.println("Factorial of " + a + " is : " + fct.fact(a));
        }
        else {
            System.out.println(a+ " is a negative number.");
        }
    }
}
class Factorial {
    static long fact(long a) {
        if(a == 1 || a == 0) {
            return 1;
        }
        else {
            return a * fact(a - 1);
        }
    }
}