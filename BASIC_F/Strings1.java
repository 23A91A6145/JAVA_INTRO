import java.util.Scanner;
// charAt();
public class Strings1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();// for entire line or more words
        // String s= sc.next() --> for only one word
        int v=s.length();
        char c=s.charAt(4);
        System.out.println(v);
        System.out.println(c);

    }
}
