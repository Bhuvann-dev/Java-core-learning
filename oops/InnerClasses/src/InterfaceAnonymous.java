interface Engine {
    void start();
}

public class InterfaceAnonymous {
    public static void main(String[] args) {
        Engine e = new Engine() { // Anonymous implementation
            public void start() {
                System.out.println("Engine started via Anonymous Interface implementation.");
            }
        };
        e.start();
    }
}