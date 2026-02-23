class Classroom {

    static int totalAttendance = 0;

    int classroomAttendance;

    public void markAttendance() {
        classroomAttendance++;
        totalAttendance++;
    }

    public void displayAttendance() {
        System.out.println("Attendence in the classroom: " + classroomAttendance);
        System.out.println("Total attendance in school: " + totalAttendance);
    }

}

public class Main {
    public static void main(String[] args) {
        Classroom c1 = new Classroom();
        
        c1.markAttendance();
        c1.markAttendance();
        c1.markAttendance();
        c1.markAttendance();
        c1.displayAttendance();

        Classroom c2 = new Classroom();
        c2.markAttendance();
        c2.displayAttendance();
        
    }
}

