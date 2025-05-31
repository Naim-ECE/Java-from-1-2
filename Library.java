import java.util.*;

class Book {
    public long isbn;
    public String title;
    public String author;
    public int price;
    public int quantity;

    public Book(long isbn, String title, String author, int price, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void setISBN(long isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void getISBN(long isbn) {
        System.out.println("ISBN : " + isbn);
    }

    public void getTitle(String title) {
        System.out.println("Title : " + title);
    }

    public void getAuthor(String author) {
        System.out.println("Author : " + author);
    }

    public void getPrice(int price) {
        System.out.println("Price : " + price);
    }

    public void getQuantity(int quantity) {
        System.out.println("Quantity : " + quantity);
    }

    public void show() {
        getISBN(isbn);
        getTitle(title);
        getAuthor(author);
        getPrice(price);
        getQuantity(quantity);
        System.out.println();
    }
}

class BookInventory {
    public ArrayList<Long> arr = new ArrayList<Long>();

    public void add_book(Book bk) {
        arr.add(bk.isbn);
    }
    public void remove_book(Book bk) {
        arr.remove(bk.isbn);
    }
    public void search(Book bk) {
        boolean b = false;

        for(long x : arr) {
            if(bk.isbn == x) {
                b = true;
                break;
            }
        }
        if(b) {
            System.out.println("Found");
            bk.show();
        }
        else System.out.println("Not found");
    }
}

public class Library {
    public static void main(String[] args) {
        BookInventory a = new BookInventory();

        Book b1 = new Book(1302, "The Truthful Guy", "JK Vilias", 500, 10);
        Book b2 = new Book(1308, "Over the Moon", "Johnny Scott", 320, 5);
        Book b3 = new Book(1908, "War", "Edward Kenway", 610, 3);
        Book b4 = new Book(2690, "Ultimate Ambition", "Jacob Frye", 200, 2);
        Book b5 = new Book(2987, "Twins", "Charles Vane", 480, 7);

        a.add_book(b1);
        a.add_book(b2);
        a.add_book(b3);
        a.add_book(b4);
        a.add_book(b5);

        a.search(b1);
        a.search(b2);
        a.search(b3);
        a.search(b4);
        a.search(b5);

        a.remove_book(b4);
        a.remove_book(b5);

        a.search(b1);
        a.search(b2);
        a.search(b3);
        a.search(b4);
        a.search(b5);
    }
}
