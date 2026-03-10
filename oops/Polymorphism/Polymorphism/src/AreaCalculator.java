abstract class Shape {
    abstract void calculateArea();
}

class Square extends Shape {
    int side = 5;
    void calculateArea() { System.out.println("Square Area: " + (side * side)); }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape s = new Square();
        s.calculateArea();
    }
}