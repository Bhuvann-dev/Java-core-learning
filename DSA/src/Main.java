
import java.util.HashSet;


public class Main {
  public static void main(String[] args) {
      Student s1 = new Student(11, "Bhuvan");
      Student s2 = new Student(12, "Frozen");
      Student s3 = new Student(11, "Bhuvan");

      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));

      HashSet hs = new HashSet();
      hs.add(s1);
      hs.add(s2);
      hs.add(s3);

      System.out.println(hs);

  }
}

