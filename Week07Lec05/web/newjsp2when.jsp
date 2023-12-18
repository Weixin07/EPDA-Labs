<%-- 
    Document   : newjsp2when
    Created on : Apr 5, 2017, 5:29:05 PM
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
        <c:set var="mark" value="${30}"/>
        <c:choose>
            <c:when test="${mark > 74}">
                Distinction!
            </c:when>
            <c:when test="${mark > 64}">
                Credit!
            </c:when>
            <c:when test="${mark > 49}">
                Pass!
            </c:when>
            <c:otherwise>
                Fail!
            </c:otherwise>
        </c:choose>
    </body>
</html>
