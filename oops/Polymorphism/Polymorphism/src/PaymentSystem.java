interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() { System.out.println("Paid using UPI"); }
}

class CreditCard implements Payment {
    public void pay() { System.out.println("Paid using Credit Card"); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
    }
}