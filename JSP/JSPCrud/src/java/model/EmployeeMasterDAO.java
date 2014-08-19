
package model;

import MyBean.Employee;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeMasterDAO extends BaseDAO {

    Connection connection = null;
    PreparedStatement stmt = null;
    Statement s = null;
    ResultSet rs = null;
    
    public boolean addEmployee(Employee e) {
        connection = getConnection();
        int count = 0;
        String sql = "insert into Employee values(?,?,?,?,?)";
        int id = e.getId();
        String username = e.getUsername();
        int age = e.getAge();
        String city = e.getCity();
        String project = e.getProject();

        try {
            //System.out.println("in try");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, username);
            stmt.setInt(3, age);
            stmt.setString(4, city);
            stmt.setString(5, project);
            count = stmt.executeUpdate();
            //System.out.println("out try");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            try {
                connection.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (count > 0) {
            System.out.println("Successfully inserted");
            return true;

        } else {
            System.out.println("Unsuccessful insertion");
            return false;
        }

    }

    public List findEmployeeByName(String name) {
        ArrayList<Employee> addlist = new ArrayList<Employee>();
        try {
            connection = getConnection();
            s = connection.createStatement();
            rs = s.executeQuery("select * from Employee where username like '%" + name + "%'");
            //System.out.println("out of while");
            while (rs.next()) {
                Employee e = new Employee();
                System.out.println("test");
                e.setId(rs.getInt(1));
                e.setUsername(rs.getString(2));
                e.setAge(rs.getInt(3));
                e.setCity(rs.getString(4));
                e.setProject(rs.getString(5));
                addlist.add(e);

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            try {
                connection.close();
                s.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return addlist;

    }

    public List findEmployeeByProject(String project) {
        ArrayList<Employee> addlist = new ArrayList<Employee>();
        try {
            connection = getConnection();
            s = connection.createStatement();
            rs = s.executeQuery("select * from Employee where project like '%" + project + "%'");
            //System.out.println("out of while");
            while (rs.next()) {
                
                Employee e = new Employee();
                System.out.println("test");
                e.setId(rs.getInt(1));
                e.setUsername(rs.getString(2));
                e.setAge(rs.getInt(3));
                e.setCity(rs.getString(4));
                e.setProject(rs.getString(5));
                addlist.add(e);

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            try {
                connection.close();
                s.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return addlist;

    }

    public void removeAccount(String name) {
        connection = getConnection();

        try {
            s = connection.createStatement();
            int count = s.executeUpdate("delete from Employee where username like '%" + name + "%'");
            if (count > 0) {
                System.out.println("Successfully Deleted");
            } else {
                System.out.println("Unsuccessful Deletion");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            try {
                connection.close();
                s.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeMasterDAO.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }

        }

    }

}
