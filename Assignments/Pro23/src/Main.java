import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a;
        System.out.print("Enter a number: ");
        a = scan.nextLong();
        System.out.println("Multiplication Table for " +a+ " is;");
        for(int i = 1; i <= 10; ++i) {
            System.out.print(a+ " x " +i);
            if(i < 10) System.out.print(" ");
            System.out.println("  = " +a * i);
        }
    }
}