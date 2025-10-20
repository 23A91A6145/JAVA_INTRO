import java.util.Scanner;

public class Loops1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }

}
