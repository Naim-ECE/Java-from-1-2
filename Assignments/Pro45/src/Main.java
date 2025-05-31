import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String... Naim) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter " + (i + 1) + " th element: ");
            a[i] = scan.nextInt();
        }
        Set <Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int element : a) {
            if(!set.add(element)) {
                duplicate.add(element);
            }
        }
        System.out.print("Duplicate elements in the array: ");
        for(int duplicates : duplicate) {
            System.out.print(duplicates + " ");
        }
        System.out.println();
    }
}