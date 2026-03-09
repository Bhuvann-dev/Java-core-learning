class Engine {
    void start() { System.out.println("Engine starting..."); }
}

class Car {
    private final Engine engine; // Composition
    Car() { this.engine = new Engine(); } 
    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class CarEngineSystem {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}