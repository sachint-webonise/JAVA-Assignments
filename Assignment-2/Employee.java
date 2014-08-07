/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsAssign;

/**
 *
 * @author webonise
 */
public class Employee {
    
    private Integer empId;
    private String firstName;
    private String lastName;
    private String gender;
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setEmpID(Integer empId){
        this.empId=empId;
    }
    
    public Integer getEmpID(){
        return empId;
    }
}
