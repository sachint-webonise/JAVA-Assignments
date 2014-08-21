/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author webonise
 */
public class HibernateUtils {

    private static SessionFactory sessionfactory;

    private static SessionFactory buildSessionFactory() {
        try {
            File f = new File("/home/webonise/NetBeansProjects/Hibernate/src/java/hibernate.cfg.xml");
            sessionfactory = new Configuration().configure(f).buildSessionFactory();

        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
        return sessionfactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionfactory = buildSessionFactory();
    }
}
