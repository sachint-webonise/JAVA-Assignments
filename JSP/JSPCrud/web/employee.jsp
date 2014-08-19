
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee Registration Form</h1>

        <form name="reg" action="EmployeeServlet.do" method="POST">
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
                    <tr>
                        <td>Project</td>
                        <td><input type="text" name="project" value="" /></td>
                    </tr>
                    <tr><input type="submit" value="Submit" /></tr>
                <tr><input type="reset" value="Reset" /></tr>
                </tbody>
            </table>

        </form>

    </body>
</html>
