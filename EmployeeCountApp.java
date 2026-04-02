// Problem 17: Employee count using static variable

class Employee {
    String name;
    int id;

    // Static variable to track number of employees
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment count whenever a new employee is created
    }

    // Display employee details
    void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class (not public, so file name can be anything)
public class EmployeeCountApp {
    public static void main(String[] args) {
        // Create employees
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        // Show details
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        // Show total employees
        Employee.displayTotalEmployees();
    }
}
