
package model;
import java.sql.*;

public class BaseDAO {
    
    Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/EmployeeManagement","root","mysql");
        }
        
        catch(ClassNotFoundException e){
            System.out.println(e);
        } 
        
        catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
}
