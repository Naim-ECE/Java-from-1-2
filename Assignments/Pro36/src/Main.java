import java.util.Scanner;
public class Main {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        long n;
        System.out.print("Enter the value of 'n' to calculate nth fibonacci number: ");
        n = scan.nextLong();
        Fibo fbn = new Fibo();
        if(n > 0) {
            System.out.println(n+ " th fibonacci number is: " + fbn.fibonacci(n));
        }
        else if(n == 0){
            System.out.println("Index number can't be zero");
        }
        else {
            System.out.println("Index number can't be negative");
        }
    }
}
class Fibo {
    static long fibonacci(long a) {
        if(a == 1) {
            return 0;
        }
        else if(a == 2){
            return 1;
        }
        else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}