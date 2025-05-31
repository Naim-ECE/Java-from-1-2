import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        GCD g = new GCD();
        System.out.print("Enter 1st number: ");
        a = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        b = scan.nextInt();
        System.out.println("Greatest common divisor of " + a + " & " + b + " is: " + g.Pro38(a, b));
    }
}
class GCD {
    static int Pro38(int x, int y) {
        if(y == 0)
            return x;
        return Pro38(y, x % y);
    }
}