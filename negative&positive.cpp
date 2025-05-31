#include<bits/stdc++.h>
using namespace std;

int main() {
    int ar[6] = {-1, -2, -3, 3, 2, 1};
    int a = ar[0];
    
    for(int i = 0; i < 6; ++i) {
        if(ar[i] > 0) {
            cout << ar[i] << " ";        
        }
    }
    for(int i = 0; i < 6; ++i) {
        if(ar[i] < 0) {
            cout << ar[i] << " ";        
        }
    }
    return 0;
}