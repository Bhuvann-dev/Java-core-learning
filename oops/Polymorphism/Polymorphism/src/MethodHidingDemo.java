class Person {
    public static void work() {
        System.out.println("Person is working.");
    }
}

class Employee extends Person {
    public static void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    public static void work() {
        System.out.println("Manager is working.");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        Manager manager = new Manager();

        // Accessing static methods using Class names
        Person.work();
        Employee.work();
        Manager.work();

        System.out.println("--- Testing Reference Type Behavior ---");

        Person p;
        
        p = employee;
        p.work(); // Calls Person.work() because of static binding

        p = manager;
        p.work(); // Calls Person.work() because of static binding
    }
}