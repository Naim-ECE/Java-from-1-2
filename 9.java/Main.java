import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
    }
}

class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getName());
    }

    public void removeStudent(int id) {
        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("Removed student with ID: " + id);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found student:");
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student(26, "Naim");
        Student s2 = new Student(62, "Ruhul");
        Student s3 = new Student(86, "Rahat");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        school.searchStudent(102);
        school.removeStudent(101);
        school.searchStudent(101); 
    }
}

/*I created a School class that effectively manages a collection of Student objects, allowing me to add, remove, and search for students by their ID. 
I utilized an ArrayList to store the students, which provides flexibility for dynamic management of the list. 
The implementation showcases basic object-oriented principles, including encapsulation and method functionality, ensuring a structured approach to handling student records. */