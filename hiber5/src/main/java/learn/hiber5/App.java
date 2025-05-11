package learn.hiber5;

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
        
        Employee emp = new Employee("Chandru", 40000, "Software Engineer", "Dev");
        sess.persist(emp);
        
        sess.getTransaction().commit();
    }
}
