import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        int yrs = 0;
        System.out.print("Input the investment amount: ");
        a = scan.nextDouble();
        System.out.print("Input the rate of interest: ");
        b = scan.nextDouble();
        System.out.print("Input number of years: ");
        yrs = scan.nextInt();
        Money m = new Money();
        m.Pro7(a, b, yrs);
    }
}
class Money {
    static void Pro7(double a, double b, int yrs) {
        double eq = ((b - 0.0005) / 100.0), sum = 0.0;
        System.out.println("Years   " + "Future Value");
        for(int i = 1; i <= yrs; ++i) {
            sum = a * (Math.exp(eq * i));
            BigDecimal value = new BigDecimal(sum);
            value = value.setScale(2,RoundingMode.DOWN);
            System.out.println(i+ "       " +value);
        }
    }
}