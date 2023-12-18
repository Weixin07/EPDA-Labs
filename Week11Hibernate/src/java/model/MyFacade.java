/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author guan.kiat
 */
public class MyFacade {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    private Session s = null;

    public void insert(Mycustomer c){
        s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();
        s.close();
    }
    
    public void update(Mycustomer c){
        s = sessionFactory.openSession();
        s.beginTransaction();
        s.update(c);
        s.getTransaction().commit();
        s.close();
    }

    public void delete(Mycustomer c){
        s = sessionFactory.openSession();
        s.beginTransaction();
        s.delete(c);
        s.getTransaction().commit();
        s.close();
    }  
    
    public Mycustomer searchByName(String z){
        s = sessionFactory.openSession();
        s.beginTransaction();
        
        String sql = "FROM Mycustomer c WHERE c.id = '"+z+"'";
        Query result = (Query)s.createQuery(sql);
        Mycustomer found = null;
        for(Iterator i=result.iterate(); i.hasNext(); ){
            Mycustomer j = (Mycustomer)i.next();
            found = new Mycustomer(j.getId(),j.getBalance(),j.getPassword());
            break;
        }
        
        s.getTransaction().commit();
        s.close();
        
        return found;
    }
}
