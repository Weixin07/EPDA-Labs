<%-- 
    Document   : newjsp2if
    Created on : Aug 25, 2016, 3:06:37 PM
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
        <c:set var="mark" value="${70}"/>
        <c:if test="${mark > 74}">
            Congratulations!
        </c:if>
        <p>Your result is: <c:out value="${mark}"/><p>
    </body>
</html>
