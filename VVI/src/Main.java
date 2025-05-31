import java.util.Scanner;
public class Main {
    static {
        System.out.println("Info: "); //It's called before the main method is executed
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stu.change(); //static can call a static. No need to create an object
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