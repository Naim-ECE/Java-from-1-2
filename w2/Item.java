class Cart_Item
{
    public String name;
    public String color;
    public int price;
    public int quantity;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}

public class Item {
    public static void main(String[] args)
    {
        Cart_Item item1 = new Cart_Item();
        item1.setName("Laptop");
        item1.setColor("Black");
        item1.setPrice(75000);
        item1.setQuantity(2);
        item1.display();

        Cart_Item item2 = new Cart_Item();
        item2.setName("Car");
        item2.setColor("Red");
        item2.setPrice(175000);
        item2.setQuantity(1);
        item2.display();
    }
}
