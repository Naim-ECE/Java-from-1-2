import java.util.Scanner;
public class Main {
    public static void main(String...Naim) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Input the number: ");
        a = scan.nextInt();
        for(int i = 1; i <= a; ++i) {
            for (int j = 1; j <= a - i; ++j) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; --j) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = a - 1; i >= 1; --i) {
            for(int j = 1; j <= a - i; ++j) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; --j) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}