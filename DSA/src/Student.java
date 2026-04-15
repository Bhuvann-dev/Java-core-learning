import java.util.Objects;

public class Student extends Object{
  int roll;
  String name;

  Student(int roll, String name) {
    this.roll = roll;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student s = (Student)obj;

    if(this.roll == s.roll && this.name.equals(s.name)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(roll, name);
  } 

  @Override
  public String toString() {
    return roll + " " + name;
  }


}
