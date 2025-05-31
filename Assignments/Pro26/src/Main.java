import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Input number of rows : ");
        a = scan.nextInt();
        for(int i = 1; i <= a; ++i) {
            for(int j = 1; j <= a; ++j) {
                if(j > (a - i)) System.out.print(i+ " ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}