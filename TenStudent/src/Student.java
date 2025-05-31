public class Student {
    public String dept, varsity, cs, name;
    public int roll, date, month, day;
    Student(String A, String B, String C, String D, int E, int F) {
        this.name = A;
        this.dept = B;
        this.cs = C;
        this.varsity = D;
        this.roll = E;
        this.date = F;
    }
    public void display() {
        System.out.println("Name: " +name);
        System.out.println("Department: " +dept);
        System.out.println("Varsity: " +varsity);
        System.out.println("Current Semester: " +cs);
        System.out.println("Roll: " +roll);
        System.out.println("Date of birth(Year): " +date);
    }
}
