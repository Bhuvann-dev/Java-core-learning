import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter unit (Celsius or Fahrenheit): ");
        String unit = scan.nextLine();
        
        System.out.println("Enter value: ");
        double value = scan.nextDouble();

        if (unit.equalsIgnoreCase("Celsius")) {
            double result = Temprature.celsiusToFahrenheit(value);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else if (unit.equalsIgnoreCase("Fahrenheit")) {
            double result = Temprature.fahrenheitToCelsius(value);
            System.out.println("Temperature in Celsius: " + result);
        } else {
            System.out.println("Invalid unit entered.");
        }
        
        scan.close();
    }
}
