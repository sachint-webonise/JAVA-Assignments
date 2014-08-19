
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr><th>ID</th><th>Username</th><th>Age</th><th>City</th><th>Project</th>
            <c:forEach var="employee" items="${Employees}">
                <tr>
                    <td><c:out value="${employee.id}" /></td>
                    <td><c:out value="${employee.username}" /></td>
                    <td><c:out value="${employee.age}" /></td>
                    <td><c:out value="${employee.city}" /></td>
                    <td><c:out value="${employee.project}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
