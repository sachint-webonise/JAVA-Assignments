/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Set;
import mybean.Person;
import mybean.Vehicle;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author webonise
 */
public class PersonDAO {

    Transaction tx = null;

    public Integer addPerson(Person p) {

        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.openSession();
        Integer personID = null;
        int id = p.getId();
        int age = p.getAge();
        String city = p.getCity();
        String name = p.getUsername();
        Set<Vehicle> vehicleset = p.getVehicles();
        System.out.println(id);
        System.out.println(age);
        System.out.println(city);
        System.out.println(name);

        Person person = new Person();
        person.setAge(age);
        person.setCity(city);
        person.setId(id);
        person.setUsername(name);
        person.setVehicles(vehicleset);

        try {
            tx = session.beginTransaction();
            personID = (Integer) session.save(person);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return personID;
    }

    public List listPerson() {

        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.openSession();
        List<Person> personList = null;
        
        try {
            tx = session.beginTransaction();
            personList = session.createQuery("from Person").list();
            
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return personList;
    }
   

}
