/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsAssign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author webonise
 */
public class EmployeeMain {
    
    public static void main(String args[]) throws IOException{
        
        List<Employee> emp= new ArrayList<Employee>();
        
        Employee e1=new Employee();
        e1.setEmpID(001);
        e1.setFirstName("Murtaza");
        e1.setLastName("Bagwala");
        e1.setGender("M");
        
        Employee e2=new Employee();
        e2.setEmpID(002);
        e2.setFirstName("Taha");
        e2.setLastName("Husain");
        e2.setGender("M");
        
        Employee e3=new Employee();
        e3.setEmpID(003);
        e3.setFirstName("Prashant");
        e3.setLastName("Singh");
        e3.setGender("M");
        
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        
        System.out.println("Method-1");
        Iterator it=emp.iterator();
        while(it.hasNext()){
            Employee e=(Employee)it.next();
            System.out.println(e.getEmpID()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getGender());
        }
        
        System.out.println("Method-2");
        ListIterator<Employee> listIterator = emp.listIterator();
        while(listIterator.hasNext()){
            Employee e=(Employee)listIterator.next();
            System.out.println(e.getEmpID()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getGender());
        }
        System.out.println("======================");
        while(listIterator.hasPrevious()){
            Employee e=(Employee)listIterator.previous();
            System.out.println(e.getEmpID()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getGender());
        }
        
        System.out.println("Method-3");
        for(Employee e: emp){
            System.out.println(e.getEmpID()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getGender());
        }
        
        System.out.println("Method-4");
        for(int i=0; i<emp.size(); i++){
            System.out.println(emp.get(i).getEmpID()+" "+emp.get(i).getFirstName()+" "+emp.get(i).getLastName()+" "+emp.get(i).getGender());
        }
        
        
        
        
    }
}
