/*1.
A virtual function is essentially a placeholder function that is declared in a base class and
that is redefined by a class derived from that base.*/


/*2.
Nonmember functions and constructor functions cannot be made virtual.*/

/*3.
A virtual function supports run-time polymorphism through the use of base class pointers.
When a base class pointer points to an object of a derived class containing a virtual
function, the specific function called is determined by the type of object being pointed to.*/

/*4.
A pure virtual function is one that contains no definition relative to the base class.*/

/*5.
An abstract class is a base class that contains at least one pure virtual function. A
polymorphic class is one that contains at least one virtual function.*/


#include<bits/stdc++.h>
using namespace std;

int main() {
    cout << "NAIM" << endl;
    return 0;
}/*6.
class base {public :
virtual int ( int a ) = 0; // ...
};
class derived : public base {public :
int f ( int a , int b ) { return a * b ; } // ...
};*/ //wrong code

/*class base {
public:
    virtual int f(int a) = 0; // Correct pure virtual function
};

class derived : public base {
public:
    int f(int a) override { return a * 2; } // Correctly overriding
};
*/ //correct code

/*I incorrectly declared the pure virtual function in the base class by missing the function name and correct syntax. 
In the derived class, I defined the method f(int a, int b), 
which does not match the base class's pure virtual function signature, so it doesn't override it. 
I corrected these by properly declaring the pure virtual function and ensuring the derived class's method signature matches.*/

/*7.
Yes, the virtual quality is inherited in C++. 
When a derived class inherits from a base class that has a virtual function, 
the derived class can override that virtual function. 
This means that when I call a virtual function on a base class pointer or reference pointing to a derived class object, 
the derived class's implementation will be executed, ensuring polymorphic behavior. */