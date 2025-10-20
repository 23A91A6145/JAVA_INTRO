import java.util.Scanner;

public class Scanning1 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();  // for integers
        float b=sc.nextFloat();  // for float values
        String s=sc.next();  //for strings only one line
        String t=sc.nextLine();  // for strings more than 1 line
        char c=sc.next().charAt(3);  // for characters at index
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(t);
        System.out.println(c);
    }
}
