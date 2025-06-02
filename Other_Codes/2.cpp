#include<bits/stdc++.h>
using namespace std;

class Student {
private:
    int id;
    string name;

public:
    Student(int i, string n) {
        id = i;
        name = n;
    }

    void displayInfo() const {
        cout << "Student ID : " << id << endl;
        cout << "Name       : " << name << endl;
    }
};

int main() {
    Student student1(2210026, "Md. Naimur Rahman Naim");

    student1.displayInfo();

    return 0;
}

/*I define a Student class that encapsulates the attributes id and name, ensuring data integrity through private member variables. 
The constructor initializes these attributes, and the displayInfo() method outputs the student's details in a clear format. 
In the main() function, I create an instance of Student and use the displayInfo() method to showcase the student's information.*/