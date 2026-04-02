// question no 10 



// Define the interface
interface Bank {
    double getInterestRate();
}

// SBI implementation
class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC implementation
class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI implementation
class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.8;
    }
}

// Main class to test
public class BankDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
