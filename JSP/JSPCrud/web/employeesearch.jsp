

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">Employee Data</h2>
        <form action="EmployeeSearch.do" method="POST">
            <table border="1">
                <tr>
                    <td> <input type="text" name="Username" value="" /></td>
                    <td> <input type="submit" value="Search" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
