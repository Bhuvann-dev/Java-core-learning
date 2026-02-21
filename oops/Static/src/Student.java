class Student {

    String name;
    int rollNumber;              // non-static
    static int totalStudents = 0; // static

    // Constructor
    Student(String name) {
        this.name = name;
        totalStudents++;
        this.rollNumber = totalStudents;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Students: " + totalStudents);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Bhuvan");
        Student s2 = new Student("Arjun");
        Student s3 = new Student("Riya");

        s1.display();
        s2.display();
        s3.display();
    }
}
