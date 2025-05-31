class Current{
    Current(){
        System.out.println("Current 1");
    }

    Current(int n){
        this();
        System.out.println(n);
    }
}

public class current_class_constructor {
    public static void main(String[] args){
        Current obj = new Current(5);
    }
    
}