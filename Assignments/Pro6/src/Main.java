import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Enter a integer value: ");
        a = scan.nextInt();
//        String res = Integer.toString(a);
//        for(int i = 0; i < res.length(); ++i) {
//            sum += Character.getNumericValue(res.charAt(i));
//        }
        AddingDigits ad = new AddingDigits();
        ad.Pro5(a);
    }
}
class AddingDigits {
    static void Pro5(int a) {
        int sum = 0;
        while(a > 0) {
            int b = a % 10;
            sum += b;
            a /= 10;
        }
        System.out.println("Total sum of the digits are: " +sum);
    }
}