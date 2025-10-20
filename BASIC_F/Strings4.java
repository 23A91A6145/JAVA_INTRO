import java.util.Scanner;
// s.indexOf();
//s.isEmpty ();
// s.lastIndexOf();
//s.replace();
//s.replaceAll();
// s.split();
// s.startswith();
public class Strings4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println(s.indexOf("is"));
        System.out.println(s1.isEmpty());
        System.out.println(s.lastIndexOf('s'));
        System.out.println(s.replace('e','a'));
        String[] arr=s.split("\\s",3);
        for(String i: arr) {
            System.out.println(i);
        }
        System.out.println(s.startsWith("w"));
        System.out.println(s.substring(2)); // prints 2 to --
        System.out.println(s.substring(3,8));
    }
}
