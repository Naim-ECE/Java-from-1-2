import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Elements in ascending order: ");
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i]);
            if(i < n - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}