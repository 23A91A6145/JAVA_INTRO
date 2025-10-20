import java.lang.Math;
class Simple
{
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a)
    {
        return a*a;
    }
}
class  Advance extends Simple
{
    double sqrt(int a)
    {
        return  Math.sqrt(a);
    }
    double pow(int a,int b)
    {
        return  Math.pow(a,b);
    }
    double exp(int a)
    {
        return Math.exp(a);
    }
}
class Inher2
{
    public static void main(String args[])
    {
        Advance av=new Advance();
        System.out.println(av.add(2,6));
        System.out.println(av.exp(20));
        System.out.println(av.sqrt(45));
        System.out.println(av.mul(3));
    }
}