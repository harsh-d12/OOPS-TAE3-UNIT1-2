
// Problem 7: Abstract class Shape with subclasses Circle and Rectangle

// Abstract base class
abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculate_area() {
        return length * width;
    }
}

// Main class
public class ShapeApp {
    public static void main(String[] args) {
        // ❌ Uncommenting the line below will cause a compilation error
        // Shape s = new Shape(); // Cannot instantiate abstract class

        // ✅ Use subclass objects
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Call both abstract and concrete methods
        circle.display_info();
        System.out.println("Circle area: " + circle.calculate_area());

        rectangle.display_info();
        System.out.println("Rectangle area: " + rectangle.calculate_area());
    }
}
