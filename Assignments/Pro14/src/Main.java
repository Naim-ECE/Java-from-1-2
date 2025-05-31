import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a, b, c;
        System.out.print("Enter three numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
//        int w = Pro14(a, b, c);
        Consecutive cs = new Consecutive();
        System.out.println(cs.Pro14(a, b, c));
    }
}
class Consecutive {
    static boolean Pro14(int a, int b, int c) {
        if(a < b && b < c && a < c) return true;
        else return false;
    }
}