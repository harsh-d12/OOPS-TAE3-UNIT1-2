class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 4.5));
    }
}
