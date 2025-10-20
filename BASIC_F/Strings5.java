import java.util.Scanner;
// toCharArray()
// toLowerCase
// toUpperCase()
// trim();
public class Strings5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c= s.toCharArray();
        int l=c.length;
        for(int i=0;i<l;i++)
        {
            System.out.println(c[i]);
        }
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim()); // to remove spaces  at begin and ends
    }
}
