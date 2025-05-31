import java.util.Scanner;
public class Main {
    public static void main(String...Naim) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        Maximum mx = new Maximum();
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }
        System.out.println("Maximum element in the array is: " + mx.Pro39(a, a.length));
    }
}
class Maximum {
    static int Pro39(int[] ar, int size) {
        if(size == 1)
            return ar[0];
        return Math.max(ar[size - 1], Pro39(ar, size - 1));
    }
}