#include<bits/stdc++.h>
using namespace std;

class Person {
private:
    string name;
    int age;

public:
    Person(string n, int a) {
        name = n;
        age = a;
    } 

    void display() const {
        cout << "Name : " << name << endl;
        cout << "Age  : " << age << endl;
    }

    int getage() {
        return age;
    }
};

int main() {
    string nam;
    int a;
    cout << "Enter name : ";
    cin >> nam;
    cout << "Enter age  : ";
    cin >> a;
    Person p(nam, a);

    p.display();

    if(p.getage() >= 18) {
        cout << nam <<" is an adult." << endl;
    } 
    else {
        cout << nam << " is not an adult." << endl;
    }

    return 0;
}

/* I have created a Person class that encapsulates the attributes name and age, initializing them through the constructor and providing methods to display information and access the age. 
In the main() function, I prompt the user for their name and age, creating a Person object with the input data. 
After displaying the person's details, I check if the individual is an adult based on their age and print the appropriate message.*/