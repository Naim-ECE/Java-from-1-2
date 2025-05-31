import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter a string: ");
        name = scan.nextLine();
        CharChecker chk = new CharChecker();
        System.out.println(chk.Pro16(name));
    }
}
class CharChecker {
    static boolean Pro16(String name) {
        int b = 0, count = 0;
        b = name.length();
        for (int i = 0; i < b; ++i) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U' || name.charAt(i) == 'E' ||
                name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                ++count;
            }
        }
        if (count == b) return true;
        else return false;
    }
}