#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar[6] = {1, 2, 3, 4, 5, 6};

    cout << "Array is : ";
    for(int i = 0; i < 6; ++i) {
        cout << ar[i] << " ";
    }
    cout << endl;
    cout << "New array is : ";
    for(int i = 0; i < 6; ++i) {
        if(ar[i] % 2 == 0) {
            cout << ar[i] << " ";
        }
    }
    
    for(int i = 0; i < 6; ++i) {
        if(ar[i] % 2 != 0) {
            cout << ar[i] << " ";
        }
    }
    cout << endl;
    return 0;
}