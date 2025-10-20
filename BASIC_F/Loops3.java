import java.util.Scanner;

public class Loops3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Populate the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Enhanced for loop to print array elements
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
