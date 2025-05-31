import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a;
        System.out.print("Enter the limit of (positive) number to calculate the sum of natural number: ");
        a = scan.nextLong();
        AddSum as = new AddSum();
        if(a > 0) {
            System.out.println("Sum of the numbers between " +1+ " to " +a+ " is : " +as.sum(a));
        }
        else {
            System.out.println(a+ " is not higher than 1");
        }
    }
}
class AddSum {
    static long sum(long a) {
        if(a == 1) {
            return a;
        }
        else {
            return a + sum(a - 1);
        }
    }
}