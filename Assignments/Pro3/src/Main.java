import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter a odd numbered string: ");
        name = scan.nextLine();
        Str s = new Str();
        s.Pro3(name);
    }
}
class Str {
    static void Pro3(String name) {
        int a = name.length();
        if(a % 2 != 0) {
            char result = name.charAt(a / 2);
            System.out.println("Middle character is: " +result);
        }
        else System.out.println("String isn't odd numbered.");
    }
}