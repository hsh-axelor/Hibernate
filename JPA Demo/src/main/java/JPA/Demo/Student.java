package JPA.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
  @Id private int rollno;
  private int marks;
  private String name;

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
  }
}
