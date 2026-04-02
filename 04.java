import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    float Compute() {
        float total = Days * Charges;
        if (total > 11000) {
            total = (float)(1.02 * total);
        }
        return total;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        Amount = Compute();

        System.out.println("\nRoom Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}
