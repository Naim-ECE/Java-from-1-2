import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a;
        System.out.print("Enter a number: ");
        a = scan.nextLong();
        System.out.println("Cube of " +a+ " is = "+a * a * a);
    }
}