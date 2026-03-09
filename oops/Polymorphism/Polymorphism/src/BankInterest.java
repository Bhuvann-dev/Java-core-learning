class Bank {
    float getRate() { return 0; }
}

class SBI extends Bank {
    float getRate() { return 7.5f; }
}

class HDFC extends Bank {
    float getRate() { return 8.1f; }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Interest: " + b.getRate() + "%");
        b = new HDFC();
        System.out.println("HDFC Interest: " + b.getRate() + "%");
    }
}