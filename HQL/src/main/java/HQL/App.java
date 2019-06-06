package HQL;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

		

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("select sum(marks) from Student  ");
//	    
		
		
		List students = (List)q.list();
//	    for(Object marks : students)
//	    
	    	System.out.println(marks);
	    
		//Student student = (Student)q.uniqueResult();
	    //System.out.println(student);
		//List<Student> students = q.list();
		//for(Student s : students)
		//{
			//System.out.println(s);
		//}
		/*Random r = new Random();
		for(int i=1;i<=50;i++) {
			
			Student s = new Student();
			s.setRollno(i);
			s.setName("name" + i);
			s.setMarks(r.nextInt(100));
			session.save(s);
		}*/
		tx.commit();
	}

}
