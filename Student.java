import java.util.HashSet;

public class Student extends HashSet {
  private String studentName;
  public Student() {
    super();
  }

  public Student(String stname) {
    studentName = stname;
  }

  public String getStudent() {
    return studentName;
  }
}