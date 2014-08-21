/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybean;

import java.util.Set;

/**
 *
 * @author webonise
 */
public class Person {
    
    private int id;
    private String username;
    private int age;
    private String city;
    private Set vehicles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }   

    public Set getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set vehicles) {
        this.vehicles = vehicles;
    }
    
    
}

