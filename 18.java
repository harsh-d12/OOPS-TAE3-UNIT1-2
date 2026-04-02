class Bank {

    final double interestRate = 5.0;   // fixed interest rate

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        double customer1 = 10000;
        double customer2 = 20000;
        double customer3 = 15000;

        System.out.println("Customer 1 Interest: " + b.calculateInterest(customer1));
        System.out.println("Customer 2 Interest: " + b.calculateInterest(customer2));
        System.out.println("Customer 3 Interest: " + b.calculateInterest(customer3));
    }
}
