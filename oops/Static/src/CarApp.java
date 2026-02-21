public class CarApp {
    public static void main(String[] args) {
        Car nano = new Car();
        nano.calculateMilage();

        Car benz = new Car();
        benz.calculateMilage();

        Car.convertKmIntoMilage();

    }
}
