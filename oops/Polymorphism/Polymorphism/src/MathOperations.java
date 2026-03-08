// File: MathOperations.java
public class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Integer Multiply: " + math.multiply(5, 4));
        System.out.println("Double Multiply: " + math.multiply(5.5, 2.0));
    }
}