package learn.hiber10_manytomany;

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
        
        Author a1 = new Author();
        Author a2 = new Author();
        Author a3 = new Author();
        Author a4 = new Author();
        Author a5 = new Author();
        
        Set<Author> auList1 = new HashSet<Author>();
        auList1.add(a1);
        auList1.add(a3);
        
        Set<Author> auList2 = new HashSet<Author>();
        auList2.add(a1);
        auList2.add(a4);
        
        Set<Author> auList3 = new HashSet<Author>();
        auList3.add(a2);
        auList3.add(a4);
        auList3.add(a5);
        
        Set<Author> auList4 = new HashSet<Author>();
        auList4.add(a2);
        auList4.add(a5);
        
        Books b1 = new Books("Harry potter", 1998, auList1);
        Books b2 = new Books("Game of thrones", 2000, auList2);
        Books b3 = new Books("The hobbit", 1995, auList3);
        Books b4 = new Books("Angels & Demons", 1993, auList4);
        
        Set<Books> boList1 = new HashSet<Books>();
        boList1.add(b1);
        boList1.add(b3);
        
        Set<Books> boList2 = new HashSet<Books>();
        boList2.add(b1);
        boList2.add(b4);
        
        Set<Books> boList3 = new HashSet<Books>();
        boList3.add(b2);
        boList3.add(b4);
        
        Set<Books> boList4 = new HashSet<Books>();
        boList4.add(b2);
        
        a1.setAuthorName("Rowling");
        a1.setBirthYear(1967);
        a1.setBooks(boList1);
        
        a2.setAuthorName("George Martin");
        a2.setBirthYear(1960);
        a2.setBooks(boList2);
        
        a3.setAuthorName("Tolkien");
        a3.setBirthYear(1890);
        a3.setBooks(boList3);
        
        a4.setAuthorName("Brown");
        a4.setBirthYear(1900);
        a4.setBooks(boList4);
        System.out.println("Data base successfully stored...");
        
        sess.persist(b1);
        sess.persist(b2);
        sess.persist(b3);
        sess.persist(b4);
        
        sess.persist(a1);
        sess.persist(a2);
        sess.persist(a3);
        sess.persist(a4);
        sess.persist(a5);
        
        sess.getTransaction().commit();
    }
}



















