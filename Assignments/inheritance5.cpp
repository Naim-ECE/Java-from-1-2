#include<bits/stdc++.h>
using namespace std;

class planet {
protected:

double distance;
int revolve;

public:

planet ( double d, int r) { distance = d; revolve = r; }

};
class earth : public planet {

double circumference;

public:
    earth(double d, int r) : planet(d, r) {
        circumference = 2 * d * 3.1416;
    }

    void show() {
        cout << "Distance from earth to sun is = " << distance << " miles" << endl;
        cout << "Revolution of the earth is    = " << revolve << " days" << endl;
        cout << "Circumference of the earth is = " << circumference << " miles" << endl;
    }
};

int main() {

    earth ob(93000000 , 365);
    ob.show ();

    return 0;
}