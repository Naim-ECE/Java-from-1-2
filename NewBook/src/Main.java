import java.util.*;
class Book {
    public String isbn, title, author;
    public int price, quantity;
    public Book(String isbn, String title, String author, int price, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public void showisbn() {
        System.out.println("Book number: " +isbn);
    }
    public void showtitle() {
        System.out.println("Title      : " +title);
    }
    public void showauthor() {
        System.out.println("Author     : " +author);
    }
    public void showprice() {
        System.out.println("Price      : " +price);
    }
    public void showquantity() {
        System.out.println("Quantity   : " +quantity);
    }
    public void display() {
        showisbn();
        showtitle();
        showauthor();
        showprice();
        showquantity();
    }
}
class BookInventory {
    public ArrayList <String> a = new ArrayList<>();
    public void add(Book b) {
        a.add(b.title);
    }
    public void remove(Book b) {
        a.remove(b.title);
    }

}
public class Main {
    public static void main(String...Naim) {
        Book b1 = new Book("12543", "The Truthful Guy", "JK Vilias", 500, 10);
        Book b2 = new Book("70926", "Over the Moon", "Johnny Scott", 320, 5);
        Book b3 = new Book("81220", "Ultimate Ambition", "Edward Kenway", 480, 2);
        Book b4 = new Book("47590", "War", "Jacob Frye", 610, 1);
        Book b5 = new Book("26138", "Twins", "Charles Vane", 200, 2);
    }
}