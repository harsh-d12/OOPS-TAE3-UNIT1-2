class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two objects
        Person p1 = new Person("Alice", 22);
        Person p2 = new Person("Bob", 25);

        // Printing details
        p1.display();
        p2.display();
    }
}
}
