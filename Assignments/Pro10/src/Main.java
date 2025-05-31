import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass;
        System.out.println("A password must have at least eight characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        pass = scan.nextLine();
        PassCode pc = new PassCode();
        if(pc.password(pass) == true) System.out.println("Password is valid: " +pass);
        else System.out.println("Password is invalid.");
    }
}
class PassCode {
    static boolean password(String pass) {
        int a = pass.length(), count = 0, count1 = 0;
        for(int i = 0; i < a; ++i) {
            if((pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') ||
                    (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) {
                ++count;
            }
            else if(Character.getNumericValue(pass.charAt(i)) >= 0 && Character.getNumericValue(pass.charAt(i)) <= 9) {
                ++count1;
            }
            else --count;
        }
        if((count + count1) == a && count1 >= 2 && (count + count1) >= 8) return true;
        else return false;
    }
}