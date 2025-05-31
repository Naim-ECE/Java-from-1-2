#include <iostream>
#include <string>
using namespace std;

class Person {
private:
    static int count;
    string name;
    int age;

public:
    Person(string n, int a) : name(n), age(a) {
        count++;
    }

    static void displayCount() {
        cout << "Total number of Person objects created: " << count << endl;
    }
};

int Person::count = 0;

int main() {
    Person p1("Alice", 30);
    Person p2("Bob", 25);
    Person p3("Charlie", 20);

    Person::displayCount();

    return 0;
}