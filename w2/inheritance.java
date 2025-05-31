class Parent
{
    String name;
    int age = 21;
}

class Child extends Parent
{
    int height;
    int weight;
}

public class inheritance {
    public static void main(String[] args)
    {
        Child ch = new Child();
        ch.name = "Naim";
        ch.weight = 75;
        System.out.println(ch.name);
        System.out.println(ch.age);
        System.out.println(ch.weight);
    }
}
