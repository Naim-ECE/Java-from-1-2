import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter three values: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        Avg w = new Avg();
        w.Pro2(a, b, c);
    }

}
class Avg {
    static void Pro2(double a, double b, double c) {
        double d = 0.0;
        d = (a + b + c) / 3.0;
        BigDecimal value = new BigDecimal(d);
        value = value.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Average value of " +a+ ", " +b+ " & " +c+ " is = " +value);
    }
}