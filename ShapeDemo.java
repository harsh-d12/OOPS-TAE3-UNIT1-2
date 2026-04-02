// Problem 11: Hierarchical Inheritance with Shapes

// Base class
class Shape {
    void display() {
        System.out.println("This is a generic shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void displayArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

// Main class to test
public class ShapeDemo {
    public static void main(String[] args) {
        // Circle object
        Circle circle = new Circle(5);
        circle.display();
        circle.displayArea();

        System.out.println("----------------------------");

        // Rectangle object
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();
        rectangle.displayArea();
    }
}
