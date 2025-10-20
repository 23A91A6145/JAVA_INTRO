class Animal
{
    void eat()
    {
        System.out.println("animals can eat");
    }
}
class Mammel extends Animal
{
    void walk()
    {
        System.out.println("mamalles can walk");
    }
}
class Dog extends Mammel
{
    void bark()
    {
        System.out.println("dog can bark");
    }
}
public class Inher3
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}