import java.util.Scanner;
// for each loop
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        //int[] arr={1,3,78,3,90};
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}