class Teacher {
    String name;
    Teacher(String name) { this.name = name; }
}

class Department {
    String deptName;
    Teacher teacher; // Aggregation
    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Teacher prof = new Teacher("Dr. Smith");
        Department cs = new Department("Computer Science", prof);
        System.out.println(prof.name + " works in " + cs.deptName);
    }
}