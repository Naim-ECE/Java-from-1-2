import viewpoint.*;
import java.lang.*;
class Student {
    public String name;
    public int age;

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public void Study() {

        System.out.printf(this.name + " is studying\n");
    }
}
class PrintClass {
    void printMethod(Student s) {

        s.Study();
    }
}

public class Main {
    public static void main(String[] args) {
        PrintClass p = new PrintClass();

        Student s1 = new Student();
        s1.setName("Naim");
        s1.setAge(21);
        p.printMethod(s1);

        Student s2 = new Student();
        s2.setName("Maruf");
        s2.setAge(21);
        p.printMethod(s2);
        //yo y = new yo(3);
    }
}
