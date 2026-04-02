// Problem 12: Abstract class Payment with different implementations

// Abstract class
abstract class Payment {
    abstract void pay(double amount);
}

// CreditCardPayment subclass
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// UPIPayment subclass
class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

// NetBankingPayment subclass
class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}

// Main class to test
public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();
        Payment netBanking = new NetBankingPayment();

        creditCard.pay(500.0);
        upi.pay(250.0);
        netBanking.pay(1000.0);
    }
}
