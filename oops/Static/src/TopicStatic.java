public class TopicStatic {

    // Static variable //
    static int a;
    static int b;

    // Non-Static variables //
    int p;
    int q;

    // Static Block //
    static {
        System.out.println("Inside static-block");
        a = 10;
        b = 20;
    }

    // Non-Static Block //
    {
        System.out.println("Inside non-static block");
        p = 100;
        q = 200;
    }

    // Static method //
    static void display1() {
    System.out.println("Inside static-method");
    System.out.println(a);
    System.out.println(b);
}

// Non-Static method
    void display2() {
    System.out.println("Inside non-static method");
    System.out.println(p);
    System.out.println(q);
}


    public static void main(String[] args) {

        // creating an object for the class //
        TopicStatic Ts = new TopicStatic();

        Ts.display1();
        Ts.display2();

    }
}

