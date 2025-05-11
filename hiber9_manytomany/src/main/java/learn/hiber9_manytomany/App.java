package learn.hiber9_manytomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration();
        con.configure();
        
        SessionFactory sf = con.buildSessionFactory();
        Session sess = sf.openSession();
        
        sess.beginTransaction();
        
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        
        Set<Student> stuList1 = new HashSet<Student>();
        stuList1.add(st2);
        stuList1.add(st3);
        
        Set<Student> stuList2 = new HashSet<Student>();
        stuList2.add(st1);
        stuList2.add(st2);
        stuList2.add(st4);
        
        Set<Student> stuList3 = new HashSet<Student>();
        stuList3.add(st1);
        stuList3.add(st4);
        
        Set<Student> stuList4 = new HashSet<Student>();
        stuList4.add(st2);
        stuList4.add(st4);
        
        Set<Student> stuList5 = new HashSet<Student>();
        stuList5.add(st4);
        
        Course c1 = new Course("Maths", "Offline", stuList1);
        Course c2 = new Course("Physics", "Online", stuList2);
        Course c3 = new Course("Chemistry", "Online", stuList3);
        Course c4 = new Course("Biology", "Offline", stuList4);
        Course c5 = new Course("Computer science", "Offline", stuList5);
        
        Set<Course> coList1 = new HashSet<Course>();
        coList1.add(c2);
        coList1.add(c3);
        
        Set<Course> coList2 = new HashSet<Course>();
        coList2.add(c1);
        coList2.add(c2);
        coList2.add(c4);
        
        Set<Course> coList3 = new HashSet<Course>();
        coList3.add(c1);
        coList3.add(c3);
        
        Set<Course> coList4 = new HashSet<Course>();
        coList4.add(c2);
        coList4.add(c4);
        coList4.add(c5);
        
        st1.setStudentName("Arun");
        st1.setStudentEdu("12-th");
        st1.setCourse(coList1);
        
        st2.setStudentName("Chandru");
        st2.setStudentEdu("10-th");
        st2.setCourse(coList2);
        
        st3.setStudentName("Hari");
        st3.setStudentEdu("10-th");
        st3.setCourse(coList3);
        
        st4.setStudentName("Boopathi");
        st4.setStudentEdu("11-th");
        st4.setCourse(coList4);
        System.out.println("Data base successfully stored...");
        
        sess.persist(st1);
        sess.persist(st2);
        sess.persist(st3);
        sess.persist(st4);
        
        sess.persist(c1);
        sess.persist(c2);
        sess.persist(c3);
        sess.persist(c4);
        sess.persist(c5);
        
        sess.getTransaction().commit();
        
    }
}










