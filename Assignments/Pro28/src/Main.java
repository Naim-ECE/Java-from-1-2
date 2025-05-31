import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b = 0;
        System.out.print("Input number of rows (half of the diamond): ");
        a = scan.nextInt();
        b = a;
        for(int i = 1; i <= a; ++i) {
            for(int j = 1; j <= b - 1; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; ++k) {
                System.out.print("*");
            }
            --b;
            System.out.println();
        }
        b = 2;
        for(int i = a - 1; i >= 1; --i) {
            for(int j = 1; j <= b - 1; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; ++k) {
                System.out.print("*");
            }
            ++b;
            System.out.println();
        }
    }
}