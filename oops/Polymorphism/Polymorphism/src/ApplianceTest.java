abstract class Appliance {
    abstract void turnOn();
    void repair() { System.out.println("Repairing appliance..."); }
}

class Fan extends Appliance {
    void turnOn() { System.out.println("Fan is spinning"); }
}

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        myFan.turnOn();
        myFan.repair();
    }
}