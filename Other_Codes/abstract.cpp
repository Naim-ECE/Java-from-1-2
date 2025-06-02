#include<bits/stdc++.h>
using namespace std;

class Abstract {
    public:
        virtual void print(string s) = 0;
};

class A : public Abstract {
    public:
        void print(string s) override {
            cout << s << endl;
        }
};

int main() {
    A a;
    a.print("Lab Report");

    return 0;
}