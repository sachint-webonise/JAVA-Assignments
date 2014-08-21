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
public class Student {
    
    private int id;
    private String name;
    private Set<Teacher> teachers;

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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
}
