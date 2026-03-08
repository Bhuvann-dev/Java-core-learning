class Vehicle {
    int speedLimit = 60;
}

class RaceCar extends Vehicle {
    int speedLimit = 200;
}

public class VariableBinding {
    public static void main(String[] args) {
        Vehicle myCar = new RaceCar();
        // This will print 60, because variables are resolved at compile-time
        System.out.println("Speed Limit: " + myCar.speedLimit);
    }
}