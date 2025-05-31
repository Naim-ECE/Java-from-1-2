#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar[8] = {1, 0, 1, 0, 1, 0, 1, 0};

    cout << "Array is : ";
    for(int i = 0; i < 8; ++i) {
        cout << ar[i] << " ";
    }
    cout << endl;

    int count = 0;
    
    for (int i = 0; i < 8; ++i) {
        if (ar[i] == 0) {
            count++;
        }
    }

    for (int i = 0; i < 8; ++i) {
        if (i < count) {
            ar[i] = 0;
        } else {
            ar[i] = 1;
        }
    }
    
    cout << "After separating array = ";
    for (int i = 0; i < 8; ++i) {
        cout << ar[i] << " ";
    }
    cout << endl;

    return 0;
}
