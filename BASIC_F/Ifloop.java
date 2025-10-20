import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int position = 0;

            for (int i = 1; i <= k; i++) {
                if (i % 2 != 0) {
                    position += 3; // Move 3 steps forward on odd seconds
                } else {
                    position -= 1; // Move 1 step backward on even seconds
                }
            }
            System.out.println(position);
        }
        sc.close();
    }
}
