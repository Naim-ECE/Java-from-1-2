import java.util.Scanner;
public class Main {
    public static void main(String... Naim) {
        Scanner scan = new Scanner(System.in);
        int n, b;
        System.out.print("Enter array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter " + (i + 1) + " th element: ");
            a[i] = scan.nextInt();
        }
        b = a[0];
        for(int i = 1; i < n; ++i) {
            if(b > a[i]) b = a[i];
        }
        System.out.println("Smallest element in array is: " +b);
    }
}