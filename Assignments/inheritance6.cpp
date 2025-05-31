#include<bits/stdc++.h>
using namespace std;

enum motor { gas, electric, diesel };
enum steering { power, rack_pinion, manual };

class vehicle {
    int num_wheels;
    int range;

public:
    vehicle(int w, int r) : num_wheels(w), range(r) {}

    void showv() {
        cout << "Wheels: " << num_wheels << "\n";
        cout << "Range: " << range << "\n";
    }
};

class motorized : public vehicle {
    motor mtr;

public:
    motorized(motor m, int w, int r) : vehicle(w, r), mtr(m) {}

    void showm() {
        cout << "Motor: ";
        switch (mtr) {
            case gas:
                cout << "Gas\n";
                break;
            case electric:
                cout << "Electric\n";
                break;
            case diesel:
                cout << "Diesel\n";
                break;
        }
    }
};

class road_use : public vehicle {
    int passengers;

public:
    road_use(int p, int w, int r) : vehicle(w, r), passengers(p) {}

    void showr() {
        cout << "Passengers: " << passengers << "\n";
    }
};

class car : public motorized, public road_use {
    steering strng;

public:
    car(steering s, motor m, int w, int r, int p)
        : motorized(m, w, r), road_use(p, w, r), strng(s) {}

    void show() {
        motorized::showv();  
        showr();
        showm();
        cout << "Steering: ";
        switch (strng) {
            case power:
                cout << "Power\n";
                break;
            case rack_pinion:
                cout << "Rack and Pinion\n";
                break;
            case manual:
                cout << "Manual\n";
                break;
        }
    }
};

int main() {
    car c(power, gas, 4, 500, 5);
    c.show();
    return 0;
}

/*I found mistakes that the enum values were not properly assigned and used, which led to syntax errors. 
I also noticed that assignments like mtr = m; were outside the constructor body, leading to improper initialization. 
Additionally, the ambiguity in calling showv() due to multiple inheritance from vehicle required me to specify the base class explicitly. 
Lastly, the misplaced braces and incorrectly structured switch statements caused further logical errors.*/