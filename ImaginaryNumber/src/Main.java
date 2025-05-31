import java.util.Scanner;
public class Main {
    double img1, img2, real1, real2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main s1 = new Main();
        Main s2 = new Main();
        System.out.print("Enter 1st real part: ");
        s1.real1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter 1st imaginary part: ");
        s1.img1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter 2nd real part: ");
        s2.real2 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter 2nd imaginary part: ");
        s2.img2 = scan.nextDouble();
        double a = Sum(s1, s2);
        double b = Sum1(s1, s2);
        System.out.print("Sum of " + s1.real1 + " + (" + s1.img1 + ")i & " + s2.real2 + " + (" + s2.img2 + ")i is = ");
        System.out.println(a + " + (" + b + ")i");
    }
    static double Sum(Main c1, Main c2) {
        return c1.real1 + c2.real2;
    }
    static double Sum1(Main d1, Main d2) {
        return d1.img1 + d2.img2;
    }
}