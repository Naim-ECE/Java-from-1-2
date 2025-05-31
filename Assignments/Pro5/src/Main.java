import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter a string: ");
        name = scan.nextLine();
        Words e = new Words();
        e.Pro5(name);
    }
}
class Words {
    static void Pro5(String name) {
        int count = 0;
        int a = name.length();
        for(int i = 0; i < a; ++i) {
            if(name.charAt(i) == ' ') {
                ++count;
            }
        }
        if(count == 0) System.out.println("Total word = " +1);
        else if(name.charAt(a - 1) == ' ') System.out.println("Total words are = " +count);
        else System.out.println("Total words are = " +(count+1));
    }
}