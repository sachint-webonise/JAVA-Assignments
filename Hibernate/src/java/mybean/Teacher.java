/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybean;

import java.util.Set;

/**
 *
 * @author Sachin tripathi
 */
public class Teacher {

    private int id;
    private String name;
    private Set<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
