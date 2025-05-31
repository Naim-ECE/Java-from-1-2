import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Input floating-point number: ");
        a = scan.nextDouble();
        System.out.print("Input another floating-point number: ");
        b = scan.nextDouble();
        BigDecimal c = new BigDecimal(a);
        BigDecimal d = new BigDecimal(b);
        c = c.setScale(3, RoundingMode.DOWN);
        d = d.setScale(3, RoundingMode.DOWN);
        if(c.equals(d)) System.out.println("They are same");
        else System.out.println("They are different");
    }
}