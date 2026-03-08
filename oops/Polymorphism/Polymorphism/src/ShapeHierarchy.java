class Shape {
    void draw() { System.out.println("Drawing a shape"); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing a circle"); }
}

class Cylinder extends Circle {
    void draw() { System.out.println("Drawing a cylinder"); }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape s;
        s = new Shape(); s.draw();
        s = new Circle(); s.draw();
        s = new Cylinder(); s.draw();
    }
}