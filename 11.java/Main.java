class Person {
    private static int count = 0;

    public Person() {
        count++;
    }

    public static void display() {
        System.out.println("Total Persons: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        Person.display();
    }
}

/*I implemented a Person class with a static variable to count the number of Person objects created. 
Each time a new object is instantiated, I increment the static count, ensuring it reflects the total number of instances. 
The static method display() allows me to easily retrieve and display the count without needing an object of the Person class. */