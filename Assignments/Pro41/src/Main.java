import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Input a degree in Fahrenheit: ");
        a = scan.nextDouble();
        b = ((a - 32.0) * 5.0) / 9.0;
        BigDecimal v1 = new BigDecimal(a);
        v1 = v1.setScale(1, RoundingMode.DOWN);
        BigDecimal v2 = new BigDecimal(b);
        v2 = v2.setScale(1, RoundingMode.DOWN);
        System.out.println(v1+ " degree Fahrenheit is equal to " +v2+ " in Celsius");
    }
}