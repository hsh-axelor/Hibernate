package onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {
  @Id private int lid;
  private String lname;

  // private Student student;

  public int getLid() {
    return lid;
  }

  public void setLid(int lid) {
    this.lid = lid;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }
  //
  //
  //// public Student getStudent() {
  // return student;}
  //
  // public void setStudent(Student student) {
  // this.student = student;}

  @Override
  public String toString() {
    return "Laptop [lid=" + lid + ", lname=" + lname + "]";
  }
}
