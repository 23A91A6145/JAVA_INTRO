class Animals {
    void sound() {
        System.out.println("animals can make sounds");
    }

    void eat() {
        System.out.println("animals can eat");
    }
}

class Dogs extends Animals{
    void bark() {
        System.out.println("dogs can bark");
    }
}

class Cats extends Animals {
    void meow() {
        System.out.println("cats can meow");
    }
}

public class Inher4 {
    public static void main(String args[]) {
        Animals a = new Animals();
        a.eat();
        a.sound();

        Dogs d = new Dogs();
        d.bark();
        d.eat(); // Inherited method
        d.sound(); // Inherited method

        Cats c = new Cats();
        c.meow();
        c.eat(); // Inherited method
        c.sound(); // Inherited method
    }
}
