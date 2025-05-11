package learn.hiber8_manytomany;

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
        
        Trainer tr1 = new Trainer();
        Trainer tr2 = new Trainer();
        Trainer tr3 = new Trainer();
        
        List<Trainer> trList1 = new ArrayList<Trainer>(); 
        trList1.add(tr1);
        trList1.add(tr2);
        
        List<Trainer> trList2 = new ArrayList<Trainer>();
        trList2.add(tr1);
        trList2.add(tr3);
        
        List<Trainer> trList3 = new ArrayList<Trainer>();
        trList3.add(tr2);
        
        List<Trainer> trList4 = new ArrayList<Trainer>();
        trList4.add(tr2);
        trList4.add(tr3);
        
        Tech tech1 = new Tech(1111, "Java", 1995, trList1);
        Tech tech2 = new Tech(2222, "SQL", 2006, trList2);
        Tech tech3 = new Tech(3333, "Python", 1997, trList3);
        Tech tech4 = new Tech(4444, "React", 2015, trList4);
        
        List<Tech> techList1 = new ArrayList<Tech>();
        techList1.add(tech1);
        techList1.add(tech2);
        
        List<Tech> techList2 = new ArrayList<Tech>();
        techList2.add(tech1);
        techList2.add(tech3);
        techList2.add(tech4);
        
        List<Tech> techList3 = new ArrayList<Tech>();
        techList3.add(tech2);
        techList3.add(tech4);
        
        tr1.setTrainerId(1);
        tr1.setTrainerName("Ayush");
        tr1.setExperience(8);
        tr1.setTechList(techList1);
        
        tr2.setTrainerId(2);
        tr2.setTrainerName("Deeptanshu");
        tr2.setExperience(6);
        tr2.setTechList(techList2);
        
        tr3.setTrainerId(3);
        tr3.setTrainerName("Ankit");
        tr3.setExperience(6);
        tr3.setTechList(techList3);
        
        sess.persist(tech1);
        sess.persist(tech2);
        sess.persist(tech3);
        sess.persist(tech4);
        
        sess.persist(tr1);
        sess.persist(tr2);
        sess.persist(tr3);
        
        sess.getTransaction().commit();
        
    }
}
















