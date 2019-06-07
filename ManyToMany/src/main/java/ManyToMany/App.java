package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String args[]) {
    Laptop lp1 = new Laptop();
    lp1.setLid(11);
    lp1.setLname("Dell");
    Laptop lp2 = new Laptop();
    lp2.setLid(12);
    lp2.setLname("hp");
    Laptop lp3 = new Laptop();
    lp3.setLid(13);
    lp3.setLname("asus");

    Student student = new Student();
    student.setMarks(50);
    student.setName("Rohan");
    student.setRollno(44);
    student.getLaptop().add(lp1);
    Student s1 = new Student();
    s1.setMarks(45);
    s1.setName("mohan");
    s1.setRollno(78);

    s1.getLaptop().add(lp1);

    Student s2 = new Student();
    s2.setMarks(67);
    s2.setName("rohit");
    s2.setRollno(33);

    s1.getLaptop().add(lp3);
    lp1.getStudent().add(s1);
    lp2.getStudent().add(s1);
    lp1.getStudent().add(s2);
    student.getLaptop().add(lp3);
    s1.getLaptop().add(lp2);

    s2.getLaptop().add(lp1);
    Configuration con =
        new Configuration()
            .configure()
            .addAnnotatedClass(Student.class)
            .addAnnotatedClass(Laptop.class);

    SessionFactory sf = con.buildSessionFactory();

    Session session = sf.openSession();

    Transaction tx = session.beginTransaction();
    session.save(lp1);
    session.save(lp2);
    session.save(s1);
    session.save(student);
    session.save(s2);
    session.save(lp3);

    tx.commit();
  }
}
