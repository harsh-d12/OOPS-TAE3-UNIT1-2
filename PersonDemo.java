// Problem 14: Multilevel inheritance with runtime polymorphism

// Base class
class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

// Employee subclass
class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an employee.");
    }
}

// Manager subclass (extends Employee → multilevel inheritance)
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a manager.");
    }
}

// Main class to test
public class PersonDemo {
    public static void main(String[] args) {
        // Runtime polymorphism: Person reference pointing to different objects
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role();  // Calls Person's role()
        p2.role();  // Calls Employee's role()
        p3.role();  // Calls Manager's role()
    }
}
