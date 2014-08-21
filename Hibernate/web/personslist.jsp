<%-- 
    Document   : personslist
    Created on : 20 Aug, 2014, 6:07:32 PM
    Author     : webonise
--%>
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
        <form action="PersonList.do" method="post">
            <input type ="submit" value="DisplayAll"/><br>
            
            <table border="1">
            <tr><th>ID</th><th>Name</th><th>Age</th><th>City</th><th>Vehicles</th>
            <c:forEach var="person" items="${persons}">
                <tr>
                    <td><c:out value="${person.id}" /></td>
                    <td><c:out value="${person.username}" /></td>
                    <td><c:out value="${person.age}" /></td>
                    <td><c:out value="${person.city}" /></td>
                    <c:forEach var="vehicle" items="${person.vehicles}" >
                        <td><c:out value="${vehicle.number}" /></td>
                        <td><c:out value="${vehicle.name}" /></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
            
        </form>
    </body>
</html>
