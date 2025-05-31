import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        String name, dept, cs, var = "RUET";
        int roll, date, month, day, date1 = 2024;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 2; ++i) {
            System.out.println("Enter info for " +(i + 1)+" th student: ");
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("Department: ");
            dept = scan.nextLine();
            System.out.print("Roll: ");
            roll = scan.nextInt();
            scan.nextLine();
            System.out.print("Current Semester: ");
            cs = scan.nextLine();
            System.out.print("Date of birth(years): ");
            date = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter month: ");
            month = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter day: ");
            day = scan.nextInt();
            scan.nextLine();
            stu[i] = new Student(name, dept, cs, var, roll, (date1 - date));
        }
        System.out.println();
        for(int i = 0; i < 2; ++i) {
            System.out.println("Details for " +(i + 1)+ " th student");
            stu[i].display();
        }
    }
}