import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        if(num > 0) System.out.println(num+ " is a positive number.");
        else if(num == 0) System.out.println("You entered " +num);
        else System.out.println(num+ " is a negative number.");
    }
}