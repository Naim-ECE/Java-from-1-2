#include<bits/stdc++.h>
using namespace std;
// using namespace boost;

void threadtasking(string name) {
    cout << "Name is : " << name << endl;
}

void task1() {

}

void task2() {

}

int main(int a, char ** ch) {
    thread thread_1 = thread(task1);
    thread thread_2 = thread(task2);
    thread t(threadtasking, "Naim");
    t.join();

    thread_1.join();
    thread_1.join();
    return 0;
}