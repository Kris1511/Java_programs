package learn.hiber4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
//    	Student st = new Student(3, "Anu", "Bangaluru", 2021);
    	
    	Configuration cfg= new Configuration();
    	cfg.configure();
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session sess = sf.openSession();
    	
    	// creating the data**********
//    	Transaction tr = sess.beginTransaction();    	
//    	sess.save(st);  	
//    	tr.commit();
    	
    	// fetching the data**********
    	Student stu = sess.get(Student.class, 1);
    	System.out.println(stu);
    	
    	// updating the data*********
//    	Student stu = sess.get(Student.class, 1);
//    	Transaction tr = sess.beginTransaction(); 
//    	if (stu != null) {
//            stu.setName("Arun kumar");  // Example update
//            sess.update(stu);	
//            tr.commit();
//            System.out.println("Student updated successfully.");
//        } else {
//            System.out.println("Student not found.");
//        }
    	
    	// delete the data*********
//    	Student stu = sess.get(Student.class, 3);
//    	Transaction tr = sess.beginTransaction();
//    	
//    	if (stu != null) {
//            sess.delete(stu);
//            tr.commit();
//            System.out.println("Student deleted successfully.");
//        } else {
//            System.out.println("Student not found.");
//        }
    }
}
















