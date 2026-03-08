
class Device {}
class Phone extends Device {
    void call() { System.out.println("Making a call..."); }
}

public class GadgetCheck {
    public static void main(String[] args) {
        Device d = new Phone();
        if (d instanceof Phone) {
            ((Phone) d).call(); // Downcasting
        }
    }
}