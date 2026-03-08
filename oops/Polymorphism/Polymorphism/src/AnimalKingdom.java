// File: AnimalKingdom.java
class Animal {
    void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.speak();
    }
}