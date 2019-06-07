package JPA.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Student s = new Student();
    // s.setMarks(99);
    // s.setName("john");
    // s.setRollno(54);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceName");
    EntityManager em = emf.createEntityManager();
    Student s = em.find(Student.class, 44);
    em.getTransaction().begin();
    // em.persist(s);
    em.remove(s);
    em.getTransaction().commit();

    // System.out.println(s);
    /* em.getTransaction().begin();
      s.setMarks(55);
      em.persist(s);
    em.getTransaction().commit();

      System.out.println(s);*/

  }
}
