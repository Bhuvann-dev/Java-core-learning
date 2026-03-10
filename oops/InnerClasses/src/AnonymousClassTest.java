class Greeting {
    void sayHello() { System.out.println("Hello!"); }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        Greeting g = new Greeting() { // Anonymous Inner Class
            @Override
            void sayHello() {
                System.out.println("Namaste from Anonymous Class!");
            }
        };
        g.sayHello();
    }
}