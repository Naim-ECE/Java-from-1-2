#include<bits/stdc++.h>
using namespace std;

class Rectangle {
private:
    double length;
    double breadth;

public:
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() const {
        return length * breadth;
    }

    bool operator==(const Rectangle& other) const {
        return this->area() == other.area();
    }

    bool operator>(const Rectangle& other) const {
        return this->area() > other.area();
    }

    bool operator<(const Rectangle& other) const {
        return this->area() < other.area();
    }
};

int main() {
    Rectangle rect1(5.0, 4.0);
    Rectangle rect2(4.0, 5.0);
    Rectangle rect3(6.1, 3.1);

    if(rect1 == rect2) {
        cout << "Rectangle1 is equal to Rectangle2 (equal area)." << endl;
    } 
    else {
        cout << "Rectangle1 is not equal to Rectangle2." << endl;
    }

    if(rect1 > rect3) {
        cout << "Rectangle1 is larger than Rectangle3." << endl;
    } 
    else {
        cout << "Rectangle1 is not larger than Rectangle3." << endl;
    }

    if(rect3 < rect1) {
        cout << "Rectangle3 is smaller than Rectangle1." << endl;
    } 
    else {
        cout << "Rectangle3 is not smaller than Rectangle1." << endl;
    }

    return 0;
}

/*I implemented a Rectangle class that overloads operators to compare the areas of rectangle objects.
I defined the ==, >, and < operators to check if two rectangles have equal areas or if one is larger or smaller than the other. 
This approach demonstrates how operator overloading can enhance the readability and functionality of my class for comparing object properties.*/