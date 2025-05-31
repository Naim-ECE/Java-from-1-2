import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, res1 = 0.0, d = 0.0, res2 = 0.0;
        System.out.print("Enter the coefficient of x\u00B2: ");
        a = scan.nextDouble();
        System.out.print("Enter the coefficient of x : ");
        b = scan.nextDouble();
        System.out.print("Enter the value of constant: ");
        c = scan.nextDouble();
        d = b*b - 4.0*a*c;
        if(d == 0) {
            res1 = (-b)/(2.0*a);
            System.out.println("Solution of (" +a +")x\u00B2+(" +b+")x+("+c+") = 0 are: " +res1+" & " +res1);
        }
        else if(d > 0) {
            res1 = (-b + (Math.sqrt(b*b - 4.0*a*c))) / (2.0 * a);
            res2 = (-b - (Math.sqrt(b*b - 4.0*a*c))) / (2.0 * a);
            System.out.println("Solution of (" +a +")x\u00B2+(" +b+")x+("+c+")= 0 are: " +res1+" & " +res2);
        }
        else {
            res1 = (-b)/(2.0*a);
            res2 = (Math.sqrt(-d)) / (2.0 * a);
            System.out.print("Solution of (" +a +")x\u00B2+(" +b+")x+("+c+")= 0 are: " +res1+" + " +res2+" i & ");
            System.out.println(res1+ " - "+res2+" i");
        }
    }
}