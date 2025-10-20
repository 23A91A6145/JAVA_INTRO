// run time polymorphism
class Shape {
    void draw() {
        System.out.println("draw");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("draw circle");
    }
}

public class Poly1 {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();  // Should print "draw rectangle"
        s = new Circle();
        s.draw();  // Should print "draw circle"
    }
}
