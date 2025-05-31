import java.util.*;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println("Product Name: " + name);
        System.out.println("Price       : " + price+ " taka");
    }
}

class ShoppingCart {
    public ArrayList<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.price;
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cart) {
            product.show();
        }
        System.out.println("Total Price : " + calculateTotal() + " taka");
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 83000.00);
        Product p2 = new Product("Headphones", 399.99);
        Product p3 = new Product("Mouse", 200.00);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct(p2);
        
        System.out.println("\nAfter removing headphones:");
        cart.displayCart();
    }
}

/*I created a shopping cart system using Product and ShoppingCart classes in Java. 
The Product class holds information about individual products, while the ShoppingCart class manages a list of products, allowing me to add, remove, and calculate the total price. 
I demonstrated this functionality in the main method by adding products to the cart and displaying the updated contents. */