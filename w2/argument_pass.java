class Arg {

    public void method1(Arg obj1) {

        System.out.println("Method 1");
        
    }

    public void method2() {

        method1(this);
        System.out.println("Method 2");

    }
}

public class argument_pass {
    public static void main(String[] args) {

        Arg obj = new Arg();
        obj.method2();

    }    
}
