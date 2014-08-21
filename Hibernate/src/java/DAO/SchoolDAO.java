/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Set;
import mybean.Person;
import mybean.Student;
import mybean.Teacher;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Sachin tripathi
 */
public class SchoolDAO {

    Transaction tx = null;

    public Integer addStudent(Student p) {

        SessionFactory factory = HibernateUtils2.getSessionFactory();
        Session session = factory.openSession();
        Integer studentID = null;
        int id = p.getId();
        String name = p.getName();
        Set<Teacher> teacherset = p.getTeachers();
        System.out.println(id);
        System.out.println(name);

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setTeachers(teacherset);

        try {
            tx = session.beginTransaction();
            studentID = (Integer) session.save(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return studentID;
    }

    public List listStudent() {

        SessionFactory factory = HibernateUtils2.getSessionFactory();
        Session session = factory.openSession();
        List<Student> studentList = null;

        try {
            tx = session.beginTransaction();
            studentList = session.createQuery("from Student").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("returning studentlist");
        return studentList;
    }
}
