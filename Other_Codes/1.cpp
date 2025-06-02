#include<bits/stdc++.h>
using namespace std;

class Book {
private:
    string title;
    string author;
    double price;

public:

    Book(string t, string a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() const {
        cout << "Title  : " << title << endl;
        cout << "Author : " << author << endl;
        cout << "Price  : " << price << " taka" << endl;
    }
};

int main() {
    Book b("Black Flag", "Edward Kenway", 410);
    
    b.display();

    return 0;
}
/*I defined a "Book" class that encapsulates attributes such as title, author, and price, ensuring data integrity through encapsulation. 
The constructor initializes these attributes, while the display() method allows me to output the book's details in a user-friendly format. 
In the main() function, I create an instance of Book, demonstrating how I can use object-oriented programming principles to model real-world entities effectively.*/
//Book(string t, string a, double p) : title(t), author(a), price(p) {}