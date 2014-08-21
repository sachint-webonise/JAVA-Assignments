<%-- 
    Document   : employee
    Created on : 19 Aug, 2014, 3:37:23 PM
    Author     : webonise
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function addRow(tableID) {
                var table = document.getElementById(tableID);

                var rowCount = table.rows.length;
                var row = table.insertRow(rowCount);

                var cell1 = row.insertCell(0);
                var element1 = document.createElement("input");
                element1.type = "text";
                element1.name = "vehicleid";
                cell1.appendChild(element1);

                var cell2 = row.insertCell(1);
                var element2 = document.createElement("input");
                element2.type = "text";
                element2.name = "vehiclename";
                cell2.appendChild(element2);
            }
        </script>
    </head>
    
    
    
    <body>
        <h1>Registration</h1>
        <form name="reg" action="PersonServlet.do" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id" value="" /></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" value="" /></td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td><input type="text" name="city" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <table border="1" id="vehicletable">
                <tbody>
                    <tr>
                        <th>Vehicle ID</th>
                        <th>Vehicle Name</th>
                    </tr>
                    <tr><input type="button" value="Add vehicle" onclick="addRow('vehicletable')" /></tr>
                </tbody>
            </table>
            
            <input type="submit" value="Submit" />
            <input type="reset" value="Reset" />
        </form>
        
    </body>
</html>
