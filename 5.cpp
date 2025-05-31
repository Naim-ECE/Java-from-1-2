#include<bits/stdc++.h>
using namespace std;

class Employee {
protected:
    string name;
    double salary;

public:
    Employee(string n, double s) {
        name = n;
        salary = s;
    }

    virtual double calculateSalary() {
        return salary;
    }

    virtual void displayInfo() {
        cout << "Employee Name: " << name << endl;
        cout << "Salary: $" << calculateSalary() << endl;
    }
};

class Manager : public Employee {
private:
    double bonus;

public:
    Manager(string n, double salary, double b) : Employee(n, salary) {
        bonus = b;
    }

    double calculateSalary() override {
        return salary + bonus;
    }

    void displayInfo() override {
        cout << "Manager Name        : " << name << endl;
        cout << "Salary (with bonus) : " << calculateSalary() << " taka" << endl;
    }
};

class Intern : public Employee {
public:
    Intern(string n, double salary) : Employee(n, salary) {}

    double calculateSalary() override {
        return salary;
    }

    void displayInfo() override {
        cout << "Intern Name: " << name << endl;
        cout << "Salary     : " << calculateSalary() << " taka" << endl;
    }
};

int main() {
    Manager m("Walid", 50000.0, 10000.0);
    Intern i("Ahmed", 10000.0);


    cout << "Manager Details:" << endl;
    m.displayInfo();
    cout << endl;

    cout << "Intern Details:" << endl;
    i.displayInfo();

    return 0;
}

/*I created an Employee class with derived classes Manager and Intern to model an organization's employee structure. 
The Employee class contains common attributes like name and salary, along with virtual methods for calculating and displaying salary, allowing for polymorphism. 
The Manager class adds a bonus attribute, while the Intern class retains a straightforward salary structure. 
In the main() function, instances of both classes are created, showcasing tailored outputs through method overriding and demonstrating the principles of inheritance. */