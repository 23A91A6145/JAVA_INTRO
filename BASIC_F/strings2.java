import java.util.Scanner;
// compareTo();
// concat();
// contains();
//endswith();
//s.equals();
public class strings2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String s2= sc.nextLine();
        String s3=sc.nextLine();
        System.out.println(s.compareTo(s3));
        System.out.println(s.concat(s2).concat(s3));
        System.out.println(s.contains("charan"));
        System.out.println(s2.endsWith("charan"));
        System.out.println(s3.equals(s));
        //String sr=s.concat(s2);
    }
}
