import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = 0, b = 0, c = 0;
        double d = 0.0;
        System.out.print("Input the value in of Minutes: ");
        a = scan.nextInt();
        d = (a / (60.0 * 24.0 * 30.0 * 12.0));
        if(d >= 1.0) {
            b = (long) d;
            d -= b;
            d *= 30.0 * 12.0;
            c = (long) d;
            System.out.println(a+ " minutes is equals to " +b+ " years & " +c+ " days");
        }
        else {
            d *= 30.0 * 12.0;
            c = (long) d;
            BigDecimal v1 = new BigDecimal(d);
            v1 = v1.setScale(2, RoundingMode.HALF_UP);
            if(c == 0) System.out.println(a+ " minutes is equals to " +b+ " years & " +v1+ " days");
            else System.out.println(a+ " minutes is equals to " +b+ " years & " +c+ " days");
        }
    }
}