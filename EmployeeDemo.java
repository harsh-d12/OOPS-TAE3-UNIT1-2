// Problem 13: Abstract class Employee with runtime polymorphism

// Abstract class
abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();

    // Display employee info
    void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return 0.20 * salary; // 20% of salary
    }
}

// Developer subclass
class Developer extends Employee {
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    @Override
    double calculateBonus() {
        return 0.10 * salary + projectIncentive; // 10% of salary + incentive
    }
}

// Main class to test
public class EmployeeDemo {
    public static void main(String[] args) {
        // Runtime polymorphism: Employee reference pointing to different objects
        Employee manager = new Manager("Alice", 101, 80000);
        Employee developer = new Developer("Bob", 102, 60000, 5000);

        manager.displayInfo();
        System.out.println("Manager Bonus: " + manager.calculateBonus());

        System.out.println("----------------------------");

        developer.displayInfo();
        System.out.println("Developer Bonus: " + developer.calculateBonus());
    }
}
