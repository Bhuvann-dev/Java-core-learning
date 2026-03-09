class Wood {
    void info() { System.out.println("This is raw wood."); }
}

class Chair extends Wood {
    void info() {
        super.info(); 
        System.out.println("This is a wooden chair.");
    }
}

public class FurnitureApp {
    public static void main(String[] args) {
        Chair myChair = new Chair();
        myChair.info();
    }
}