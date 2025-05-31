#include<bits/stdc++.h>
using namespace std;

class Calculator {
public:
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if(b != 0) {
            return a / b;
        } 
        else {
            cout << "Math Error!" << endl;
            return 0;
        }
    }
};

int main() {
    Calculator calc;
    double a, b;
    char ch;

    cout << "Enter first number: ";
    cin >> a;
    cout << "Enter second number: ";
    cin >> b;
    cout << "Enter an operation (+, -, *, /): ";
    cin >> ch;

    double result;

    if(ch == '+') {
        result = calc.add(a, b);
        cout << "Result: " << result << endl;
    } 
    
    else if(ch == '-') {
        result = calc.subtract(a, b);
        cout << "Result: " << result << endl;
    } 
    
    else if(ch == '*') {
        result = calc.multiply(a, b);
        cout << "Result: " << result << endl;
    } 
    
    else if(ch == '/') {
        result = calc.divide(a, b);
        if(b != 0) {
            cout << "Result: " << result << endl;
        }
    } 
    
    else {
        cout << "Invalid operation!" << endl;
    }

    return 0;
}

/* I made a Calculator class that offers methods for addition, subtraction, multiplication, and division, including error handling for division by zero. 
In the main() function, I prompt the user to enter two numbers and an operation, using conditional statements to execute the appropriate calculation. 
This implementation showcases basic object-oriented programming principles while enabling interactive arithmetic operations.*/