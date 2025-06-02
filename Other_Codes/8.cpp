#include<bits/stdc++.h>
using namespace std;

class Appliance {
public:
    virtual void turnOn() = 0; // Pure virtual function
};

class WashingMachine : public Appliance {
public:
    void turnOn() override {
        cout << "Washing Machine is now running." << endl;
    }
};

class Refrigerator : public Appliance {
public:
    void turnOn() override {
        cout << "Refrigerator is now cooling." << endl;
    }
};

int main() {
    WashingMachine wm;
    Refrigerator fridge;

    wm.turnOn();
    fridge.turnOn();

    return 0;
}

/*I implemented an abstract class Appliance that defines a contract for its subclasses with a pure virtual method turnOn(). 
The subclasses WashingMachine and Refrigerator provide specific implementations of the turnOn() method, showcasing method overriding. 
I demonstrated the functionality in the main function by creating instances of both appliances and calling their turnOn() methods to see their distinct behaviors.*/