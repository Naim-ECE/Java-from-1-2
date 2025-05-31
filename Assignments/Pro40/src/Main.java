import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = scan.nextInt();
        int[] a = new int[n];
        Product p = new Product();
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }
        System.out.println("Product of all elements of the array is: " + p.Pro40(a, a.length));

    }
}
class Product {
    static int Pro40(int[] ar, int b) {
        if(b <= 0)
            return 1;
        return ar[b - 1] * Pro40(ar, b - 1);
    }
}