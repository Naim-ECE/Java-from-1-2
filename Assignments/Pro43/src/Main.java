import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int [n];
        for(int i = 0; i < n; ++i) {
            System.out.print("Enter " +(i + 1)+ " th element: ");
            a[i] = scan.nextInt();
        }
        System.out.println("After copying 'a' array elements to 'b' array;");
        for(int i = 0; i < n; ++i) {
            b[i] = a[i];
        }
        System.out.print("b["+n+"] = { ");
        for(int i = 0; i < n; ++i) {
            System.out.print(b[i]);
            if(i < n - 1) System.out.print(", ");
        }
        System.out.print(" }\n");
    }
}