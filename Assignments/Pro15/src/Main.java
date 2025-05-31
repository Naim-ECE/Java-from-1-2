import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Input an integer: ");
        a = scan.nextInt();
        System.out.println("Check whether every digit of the said integer is even or not!");
        DigitChecker dc = new DigitChecker();
        System.out.println(dc.Pro15(a));
    }
}
class DigitChecker {
    static boolean Pro15(int x) {
        int b, count1 = 0, count2 = 0;
        while(x > 0) {
            b = x % 10;
            if((b % 2) == 0) ++count1;
            ++count2;
            x /= 10;
        }
        if(count1 == count2) return true;
        else return false;
    }
}