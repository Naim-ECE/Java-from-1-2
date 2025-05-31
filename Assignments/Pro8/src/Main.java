import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a, b;
        System.out.print("Enter two characters: ");
        a = scan.next().charAt(0);
        b = scan.next().charAt(0);
        PrintChar ch = new PrintChar();
        ch.Pro8(a, b);
    }
}
class PrintChar {
    static void Pro8(char a, char b) {
        int value1 = (int) a, value2 = (int) b, count = -1;
        if(value1 < value2) {
            System.out.println("Characters between " +a+ " to " +b+ " are: ");
            for(int i = value1; i <= value2; ++i) {
                char c = (char) i;
                ++count;
                if(count % 20 == 0) System.out.println();
                System.out.print(c+" ");
            }
        }
        else if(value1 == value2) System.out.println("You Entered \"" +a+ "\" twice.");
        else System.out.println("\"" +a+ "\" and \"" +b+ "\" aren't arranged in order.");
    }
}