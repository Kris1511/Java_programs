package learn.hiber7_onetomany;

import java.util.ArrayList;
import java.util.List;

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
    	
//    	1
    	Person p1 = new Person();
    	
    	Car c1 = new Car(101, "Arun", "Maruti", 300000, p1);
    	Car c2 = new Car(102, "Boopathi", "Honda", 600000, p1);
    	
    	List<Car> carList1 = new ArrayList<Car>();
    	carList1.add(c1);
    	carList1.add(c2);
    	
    	p1.setId(1);
    	p1.setName("Top G");
    	p1.setCarList(carList1);
    	
//    	2
    	Person p2 = new Person();
    	
    	Car c3 = new Car(303, "Anadh", "Audi", 1000000, p2);
    	Car c4 = new Car(404, "Kapur", "BMW", 2000000, p2);
    	
    	List<Car> carList2 = new ArrayList<Car>();
    	carList2.add(c3);
    	carList2.add(c4);
    	
    	p1.setId(2);
    	p1.setName("Mukash ambani");
    	p1.setCarList(carList2);
    	System.out.print("Data stored in database..");
    	
    	sess.persist(p1);
    	sess.persist(p2);
    	
    	sess.persist(c1);
    	sess.persist(c2);
    	sess.persist(c3);
    	sess.persist(c4);    	
    	
    	sess.getTransaction().commit();
    	
    }
}












