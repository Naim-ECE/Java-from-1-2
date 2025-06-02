#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Book {
private:
    string title;
    string author;
    double price;

public:
    Book(string t, string a, double p) : title(t), author(a), price(p) {}

    void display() const {
        cout << "Title: " << title << ", Author: " << author << ", Price: " << price << " taka" << endl;
    }

    string getTitle() const { // Added method to get the title
        return title;
    }
};

class Library {
private:
    vector<Book> books;

public:
    void addBook(const Book& book) {
        books.push_back(book);
    }

    void removeBook(const string& title) {
        for (auto it = books.begin(); it != books.end(); ++it) {
            // Assuming title is unique for each book
            if (it->getTitle() == title) {
                books.erase(it);
                cout << "Book removed: " << title << endl;
                return;
            }
        }
        cout << "Book not found: " << title << endl;
    }

    void displayBooks() const {
        if (books.empty()) {
            cout << "No books available in the library." << endl;
            return;
        }

        cout << "Available Books:" << endl;
        for (const auto& book : books) {
            book.display();
        }
    }
};

int main() {
    Library library;

    // Adding books to the library
    library.addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", 300));
    library.addBook(Book("1984", "George Orwell", 350));
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee", 400));

    // Displaying all available books
    library.displayBooks();
    cout << endl;

    // Removing a book
    library.removeBook("1984");

    // Displaying books after removal
    library.displayBooks();
    cout << endl;

    // Attempting to remove a non-existing book
    library.removeBook("Moby Dick");

    return 0;
}