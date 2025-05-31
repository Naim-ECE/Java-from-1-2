import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        CartItem[] c = new CartItem[2];
        for(int i = 0; i < 2; ++i) {
            System.out.println("Enter info for " +(i + 1)+ " th product:");
            c[i] = new CartItem();
            c[i].setName();
            c[i].setColor();
            c[i].setQuantity();
            c[i].setPrice();
        }
        for(int i = 0; i < 2; ++i) {
            System.out.println("Details for " +(i + 1)+ " th product");
            c[i].getDetails();
        }
    }
}
class CartItem {
    String name, color;
    double price;
    int quantity;
    Scanner scan = new Scanner(System.in);

    void setName() {
        System.out.print("Enter the product name: ");
        name = scan.nextLine();
    }
    void setColor() {
        System.out.print("Enter the color: ");
        color = scan.nextLine();
    }
    void setQuantity() {
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        scan.nextLine();
    }
    void setPrice() {
        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        scan.nextLine();
    }
    void getDetails() {
        System.out.println("Name    : " +name);
        System.out.println("Color   : " +color);
        System.out.println("Quantity: " +quantity);
        System.out.printf("Price   : %.2f $\n\n" , (price * quantity));
    }
}