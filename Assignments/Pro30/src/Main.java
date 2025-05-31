import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, count = 0;
        System.out.print("Input the number: ");
        a = scan.nextInt();
        for(int i = 1; i <= a; ++i) {
            ++count;
            if(count > 1) {
                for (int k = 1; k < count; ++k) {
                    System.out.print(" ");
                }
            }
            for(int j = i; j <= a; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}