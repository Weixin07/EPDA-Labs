<%-- 
    Document   : newjsp8set
    Created on : Aug 25, 2016, 3:33:10 PM
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
        <c:set var="Site" scope="session" value="BeginnersBook.com"/>
        <c:set var="author" scope="session" value="Chaitanya"/>
        <c:remove var="author"/>
        <a href="newjsp8.jsp">check attributes</a>
    </body>
</html>
