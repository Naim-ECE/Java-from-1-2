public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();
        c.go();
        b.stop();
        System.out.println("Car has " + c.wheels + " wheels.");
        System.out.println("Bicycle has " + b.pedals + " pedals.");
    }
}