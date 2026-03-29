import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    Student(int r, String n) { this.rollNo = r; this.name = n; }

    public int compareTo(Student st) {
        return this.rollNo - st.rollNo; // Sort by Roll Number
    }
}

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(102, "Bhuvan"));
        al.add(new Student(101, "Sahana"));
        Collections.sort(al);
        for (Student s : al) System.out.println(s.rollNo + " " + s.name);
    }
}