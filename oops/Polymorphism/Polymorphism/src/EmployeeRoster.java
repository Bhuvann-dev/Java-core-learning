
class Employee {
    void work() { System.out.println("Employee is working"); }
}

class Developer extends Employee {
    void work() { System.out.println("Writing Java Code"); }
}

class Designer extends Employee {
    void work() { System.out.println("Creating 3D Assets"); }
}

public class EmployeeRoster {
    public static void main(String[] args) {
        Employee[] team = { new Developer(), new Designer(), new Employee() };
        for (Employee e : team) {
            e.work();
        }
    }
}