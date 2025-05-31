import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            System.out.print("Enter " +(i + 1)+ " th element: ");
            a[i] = scan.nextInt();
        }
        System.out.print("Elements in reverse order are: ");
        for(int i = n - 1; i >= 0; --i) {
            System.out.print(a[i]);
            if(i > 0) System.out.print(", ");
        }
        System.out.println();
    }
}