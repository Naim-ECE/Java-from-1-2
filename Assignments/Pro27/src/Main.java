import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, count = 0;
        System.out.print("Input number of rows : ");
        a = scan.nextInt();
        for(int i = 1; i <= a; ++i) {
            for(int j = 1; j <= i; ++j) {
                ++count;
                System.out.print(count+ " ");
            }
            System.out.println();
        }
    }
}