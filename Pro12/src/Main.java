import java.util.Scanner;
public class Main {
    static {
        System.out.println("Info: ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stu.change();
        Stu s1 = new Stu();
        s1.display();
    }
}
class Stu {
    static String college = "NGC";
    static void change() {
        college = "NDC";
    }
    void display() {
        System.out.println("Name: " +college);
    }
}