public class Excep3{
    public static void main(String args[]){
        try{
            int a=20/0;
            System.out.println(a);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        catch(IllegalArgumentException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println(e2.getMessage());

        }
        catch(Exception e3){
            System.out.println(e3.getMessage());
        }
    }
}