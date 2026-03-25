class World {
    class Country {
        class City {
            void location() { System.out.println("Inside City -> Country -> World"); }
        }
    }
}

public class DeepNest {
    public static void main(String[] args) {
        World w = new World();
        World.Country c = w.new Country();
        World.Country.City city = c.new City();
        city.location();
    }
}