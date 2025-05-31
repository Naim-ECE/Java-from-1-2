class Current
{
    public void method1()
    {
        System.out.println("Method 1");
    }

    public void method2()
    {
        System.out.println("Method 2");
        this.method1();
    }
}

public class current_class_method {
    public static void main(String[] args)
    {
        Current obj = new Current();
        obj.method2();
    }
    
}
