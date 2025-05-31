#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Product {
private:
    string name;
    double price;

public:
    Product(string n, double p) : name(n), price(p) {}

    double getPrice() const {
        return price;
    }

    string getName() const {
        return name;
    }
};

class ShoppingCart {
private:
    vector<Product> products;

public:
    void addProduct(const Product& product) {
        products.push_back(product);
        cout << product.getName() << " added to the cart." << endl;
    }

    void removeProduct(const string& productName) {
        for (auto it = products.begin(); it != products.end(); ++it) {
            if (it->getName() == productName) {
                cout << productName << " removed from the cart." << endl;
                products.erase(it);
                return;
            }
        }
        cout << productName << " not found in the cart." << endl;
    }

    double calculateTotal() const {
        double total = 0.0;
        for (const auto& product : products) {
            total += product.getPrice();
        }
        return total;
    }

    void displayCart() const {
        cout << "Shopping Cart contains:" << endl;
        for (const auto& product : products) {
            cout << "- " << product.getName() << ": $" << product.getPrice() << endl;
        }
    }
};

int main() {
    ShoppingCart cart;

    Product p1("Laptop", 999.99);
    Product p2("Headphones", 199.99);
    Product p3("Mouse", 49.99);

    cart.addProduct(p1);
    cart.addProduct(p2);
    cart.addProduct(p3);

    cart.displayCart();

    cout << "Total Price: $" << cart.calculateTotal() << endl;

    cart.removeProduct("Headphones");
    cart.displayCart();

    cout << "Total Price after removal: $" << cart.calculateTotal() << endl;

    return 0;
}