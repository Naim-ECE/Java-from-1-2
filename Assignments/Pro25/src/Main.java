import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Input number of rows : ");
        a = scan.nextInt();
        for(int i = 1; i <= a; ++i) {
            for(int j = 1; j <= i; ++j){
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }
}