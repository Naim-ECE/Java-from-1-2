#include<bits/stdc++.h>
using namespace std;

class building {
protected:
    int floors;
    int rooms;
    double footage;
};

class house : public building {
    int bedrooms;
    int bathrooms;

public:
    house(int f, int r, double ft, int br, int bt) {
        floors = f;
        rooms = r;
        footage = ft;
        bedrooms = br;
        bathrooms = bt;
    }

    void show() {
        cout << "(House)\n";
        cout << "Floors         : " << floors << endl;
        cout << "Rooms          : " << rooms << endl;
        cout << "Square footage : " << footage << endl;
        cout << "Bedrooms       : " << bedrooms << endl;
        cout << "Bathrooms      : " << bathrooms << endl;
    }
};

class office : public building {
    int phones;
    int extinguishers;

public:
    office(int f, int r, double ft, int p, int e) {
        floors = f;
        rooms = r;
        footage = ft;
        phones = p;
        extinguishers = e;
    }

    void show() {
        cout << "\n(Office)\n";
        cout << "Floors             : " << floors << endl;
        cout << "Rooms              : " << rooms << endl;
        cout << "Square footage     : " << footage << endl;
        cout << "Telephones         : " << phones << endl;
        cout << "Fire extinguishers : ";
        cout << extinguishers << endl;
    }
};

int main() {

    house h(3, 15, 8215, 6, 3);
    office of(7, 35, 15840, 14, 7);
    
    h.show();
    of.show();

    return 0;
}

/*2. Whenever a base class is inherited as public, all of the public members of the base become public
members of the derived class, and the base’s private members remain private to the base class.
If the base class is inherited as private, all members of the base class become private members of the
derived class.*/

/*3. Protected means the baseclass members are private but they can be inherited by the child class. 
When used as an inheritance access specifier, protected
causes all public and protected members of the base class to become protected members
of the derived class.*/

/*When an object of the derived class is created, the constructor of the base class is called first, 
followed by the derived class constructor and when the object is destroyed, the destructor of the derived class is called first, 
followed by the base class destructor.*/