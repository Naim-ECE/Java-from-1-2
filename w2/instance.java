class Hello
{
    public int Roll;
    public int Age;

    Hello(int Roll, int Age)
    {
        this.Roll = Roll;
        this.Age = Age;
    }

    public void display()
    {
        System.out.println("Roll = " + Roll + " Age = " + Age);
    }
}

public class instance {
    public static void main(String[] args)
    {
        Hello hi = new Hello(5, 6);  
        hi.display();  
    }
}