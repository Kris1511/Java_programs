package learn.hiber6_onetoone;

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
        
        Person p = new Person();
        
        AadharCard ac = new AadharCard(1111, "Chan", "Silk board", "Male", p);
        
        p.setId(102);
        p.setName("Chandru");
        p.setCard(ac);
        System.out.println("Successfully added in table");
        
        sess.persist(p);
        sess.persist(ac);
        
        sess.getTransaction().commit();
    }
}
