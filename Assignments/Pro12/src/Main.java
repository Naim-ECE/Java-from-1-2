public class Main {
    public static void main(String...args) {
        Prime p = new Prime();
        p.Pro12(100);
    }
}
class Prime {
    static boolean Pro12ii(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void Pro12(int limit) {
        for(int i = 2; i < limit; ++i) {
            if(Pro12ii(i)) {
                int prime1 = i + 2;
                if(Pro12ii(prime1)) {
                    System.out.println("(" + i + ", " + prime1 + ")");
                }
            }
        }
    }
}