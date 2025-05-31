import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter a string: ");
        name = scan.nextLine();
        Vowel v = new Vowel();
        v.Pro4(name);
    }
}
class Vowel {
    static void Pro4(String name) {
        int count = 0;
        for(int i = 0; i < name.length(); ++i) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U' || name.charAt(i) == 'E' ||
                    name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                ++count;
            }
        }
        System.out.println("There are total " +count+ " vowels in the string.");
    }
}