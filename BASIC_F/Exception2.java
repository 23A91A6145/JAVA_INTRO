public class Exception2{
    public static void main(String[] args){
        try{
            String input="abc";
            int num=Integer.parseInt(input);
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}