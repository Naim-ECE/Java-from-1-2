import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a;
        System.out.print("Input a number: ");
        a = scan.nextLong();
        FindingTwo ftw = new FindingTwo();
        if(a < 0) System.out.println(a+ " is not a positive number.");
        else if(ftw.Pro13(a) >= 0) System.out.println(ftw.Pro13(a));
    }
}
class FindingTwo {
    static long Pro13(long a) {
        long count = 0, b;
        if(a > 0) {
            while(a > 0) {
                b = a % 10;
                if (b == 2) ++count;
                a /= 10;
            }
            return count;
        }
        else return count;
    }
}