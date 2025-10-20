import java.util.Scanner;

public class Strings3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.printf("my name is %s. I am %.0f years old. Secured %.2f percentile\n", s, a, b);
        System.out.println();
    }
}
