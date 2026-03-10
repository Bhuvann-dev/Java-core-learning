class Outer {
    int x = 10;

    class Inner {
        int x = 20;
        void printX() {
            System.out.println("Inner x: " + x);
            System.out.println("Outer x: " + Outer.this.x);
        }
    }
}

public class ShadowingDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.printX();
    }
}