public class TopicStatic2 {

    // static variable //
    static int a; 

    // static block;
    static {
        System.out.println("Inside static block");
        a = 10;
    }

    // Non-Static variable //
    int b;

    // Non- Static method //
    void display() 
    {
        System.out.println("Static a: " + a);
        System.out.println("Instance b: " + b);
    }

    public static void main(String[] args) {


        TopicStatic2 T2 = new TopicStatic2();

        T2.display();

        T2.b = 200;
        System.out.println(T2.b);
        T2.a = 99;
        System.err.println(T2.a);

        TopicStatic2 T3 = new TopicStatic2();

        T3.display();

        T3.b = 400;
        System.out.println(T3.b);
        T3.a = 66;
        System.err.println(T3.a);
    }

}
