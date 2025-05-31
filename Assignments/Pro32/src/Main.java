import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input first number: ");
        a = scan.nextInt();
        System.out.print("Input second number: ");
        b = scan.nextInt();
        System.out.print("Input third number: ");
        c = scan.nextInt();
        if(a == b && b == c) System.out.println("All numbers are equal");
        else if(a != b && b != c && c != a) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}