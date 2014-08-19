
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search employee by project</h1>
        <form action="ProjectSearch.do" method="POST">

            <table border="1">
                <tr>
                    <td><input type="text" name="project" value="" /></td>
                    <td><input type="submit" value="Search" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
