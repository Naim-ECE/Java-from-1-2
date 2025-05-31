import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.print("Input Side-1: ");
        a = scan.nextDouble();
        System.out.print("Input Side-2: ");
        b = scan.nextDouble();
        System.out.print("Input Side-3: ");
        c = scan.nextDouble();
        AreaofTriangle at = new AreaofTriangle();
        at.Pro11(a, b, c);
    }
}
class AreaofTriangle {
    static void Pro11(double a, double b, double c) {
        double area = 0.0, s = 0.0;
        s = (a + b + c) / 2.0;
        area = Math.sqrt(s*((s - a) * (s - b) * (s - c)));
        BigDecimal value = new BigDecimal(area);
        value = value.setScale(13, RoundingMode.HALF_UP);
        System.out.println("The area of the triangle is " +value);
    }
}