<%-- 
    Document   : newjsp3for
    Created on : Aug 25, 2016, 3:10:30 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="i" begin="1" end="5">
            Item <c:out value="${i}"/><p>
        </c:forEach>
    </body>
</html>
