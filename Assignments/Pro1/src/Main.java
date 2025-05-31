import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        Smlnum s = new Smlnum();
        s.Pro1(a, b, c);
    }
}
class Smlnum {
    static void Pro1(int a, int b, int c) {
        if(a <= b && a <= c) System.out.println("Smallest number is: " +a);
        else if(b <= a && b <= c) System.out.println("Smallest number is: " +b);
        else System.out.println("Smallest number is: " +c);
    }
}