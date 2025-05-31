import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, b, count = 1;
        System.out.print("Enter the size of the array: ");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        b = a[0];
        for(int i = 1; i < n; ++i) {
            if(b == a[i]) {
                ++count;
            }
            else {
                System.out.println(b + " used = " +count + " times");
                b = a[i];
                count = 1;
            }
        }
        System.out.println(b + " used = " + count + " times");
    }
}