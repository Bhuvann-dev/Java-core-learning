class University {
    private String uniName = "Global Tech University";

    class Department { // Member Inner Class
        void display() {
            System.out.println("Department of " + uniName);
        }
    }
}

public class UniversityOuter {
    public static void main(String[] args) {
        University uni = new University();
        University.Department dept = uni.new Department();
        dept.display();
    }
}