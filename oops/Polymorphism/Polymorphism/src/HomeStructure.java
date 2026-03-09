class Room {
    void type() { System.out.println("This is a Bedroom."); }
}

class House {
    private final Room room; // Composition
    House() { this.room = new Room(); } 
    void show() { room.type(); }
}

public class HomeStructure {
    public static void main(String[] args) {
        House myHome = new House();
        myHome.show();
    }
}