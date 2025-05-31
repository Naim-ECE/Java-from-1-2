import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Enter a year: ");
        a = scan.nextInt();
        Newyear nw = new Newyear();
        nw.Pro9(a);
    }
}
class Newyear {
    static void Pro9(int a) {
        if(a % 4 == 0) System.out.println(a+ " is a leap year.");
        else System.out.println(a+ " is not a leap year.");
    }
}
