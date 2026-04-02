// Problem 16: Hospital staff with inheritance and polymorphism

// Base class
class Staff {
    void work() {
        System.out.println("General staff work.");
    }
}

// Doctor subclass
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor treats patients and prescribes medicines.");
    }
}

// Nurse subclass
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse assists doctors and cares for patients.");
    }
}

// Receptionist subclass
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist manages appointments and greets visitors.");
    }
}

// Main class to test
public class StaffDemo {
    public static void main(String[] args) {
        // Runtime polymorphism: Staff reference pointing to different objects
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
