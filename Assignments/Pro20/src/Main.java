import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = 0;
        a = scan.nextInt();
        while(a > 7) {
            a -= 7;
        }
        System.out.println("Weekday value: " +a);
        System.out.print("Weekday name : ");
        if(a == 1) System.out.println("Sunday");
        else if(a == 2) System.out.println("Monday");
        else if(a == 3) System.out.println("Tuesday");
        else if(a == 4) System.out.println("Wednesday");
        else if(a == 5) System.out.println("Thursday");
        else if(a == 6) System.out.println("Friday");
        else System.out.println("Saturday");
    }
}