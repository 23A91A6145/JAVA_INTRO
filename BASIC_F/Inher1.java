class Parent
{
    int x=10;
    void display()
    {
        System.out.println("value is "+x);
    }
}
class Child extends Parent
{
    int y=30;
    void some()
    {
        System.out.println("vale is"+(x+y));
    }
}
class Inher1
{
    public static void main(String args[])
    {
        Parent p=new Parent();
        p.display();
        Child c=new Child();
        c.some();
    }
}