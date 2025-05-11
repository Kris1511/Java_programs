package learn.hiber4_onetomany;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Person p1 = new Person();
		
		Bike b1 = new Bike(1001, "Pulsur", 97000, p1);
		Bike b2 = new Bike(2002, "Apache", 90000, p1);
		
		List<Bike> bikeList1 = new ArrayList<Bike>();
		bikeList1.add(b1);
		bikeList1.add(b2);
		
		p1.setId(1);
		p1.setName("mahi");
		p1.setBikeList(bikeList1);
		
		sess.persist(p1);
		
		sess.persist(b1);
		sess.persist(b2);
		
		sess.getTransaction().commit();
    	
    }
}
















