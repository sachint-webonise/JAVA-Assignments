<%-- 
    Document   : studentlist
    Created on : 21 Aug, 2014, 4:30:28 PM
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
        <form action="StudentList.do" method="post">
            <input type ="submit" value="DisplayAll"/><br>
            
            <table border="1">
            <tr><th>ID</th><th>Name</th><th>Teachers</th>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><c:out value="${student.id}" /></td>
                    <td><c:out value="${student.name}" /></td>
                    <c:forEach var="teacher" items="${student.teachers}" >
                        <td><c:out value="${teacher.id}" /></td>
                        <td><c:out value="${teacher.name}" /></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
            
        </form>
    </body>
</html>
