import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Predefined{
    public static void main(String args[]) {
        System.out.println(Math.sqrt(85));
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements before sorting");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("array elements after sorting");  // Corrected line
        System.out.println(Arrays.toString(arr));
        sc.close();  // Closing the scanner
    }
}
