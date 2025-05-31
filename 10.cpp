#include<bits/stdc++.h>

using namespace std;

class Game {
private:
    string status;

public:
    Game() {
        status = "Not Started";
    }

    void start() {
        status = "Running";
        cout << "Game started!" << endl;
    }

    void pause() {
        if(status == "Running") {
            status = "Paused";
            cout << "Game paused!" << endl;
        } else {
            cout << "Game is not running!" << endl;
        }
    }

    void end() {
        status = "Ended";
        cout << "Game ended!" << endl;
    }

    void display() const {
        cout << "Current Game Status: " << status << endl;
    }
};

int main() {
    Game g;

    g.display();
    g.start();
    g.display();
    g.pause();
    g.display();
    g.end();
    g.display();

    return 0;
}

/*I designed a Game class that manages the game's status, allowing transitions between "Not Started", "Running", "Paused", and "Ended". The methods provide a clear interface for starting, pausing, and ending the game while displaying the current status at each step. 
This implementation effectively demonstrates how to encapsulate game logic in a class structure while allowing for easy management of the game's state.*/