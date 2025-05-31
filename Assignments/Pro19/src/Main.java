import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.print("Enter a value: ");
        a = scan.nextDouble();
        if(a == 0.0) System.out.println("zero");
        else if(a < 0.0) {
            System.out.print("negative");
            double d = Math.abs(a);
            if(d < 1.0) System.out.print(" small");
            if(d > 1000000.0) System.out.print(" large");
        }
        else System.out.print("positive");
        System.out.println();
    }
}