import java.util.Scanner;
public class Main {
    public static void main(String...Naim) {
        Scanner scan = new Scanner(System.in);
        int a, b, i, j, k;
        System.out.print("Input number of rows: ");
        a = scan.nextInt();
        for(i = 0; i < a; ++i) {
            b = 1;
            for(j = 0; j < (a - i) - 1; ++j)
                System.out.print(" ");
            for(k = 0; k <= i; ++k) {
                System.out.print(b +" ");
                b = b * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}