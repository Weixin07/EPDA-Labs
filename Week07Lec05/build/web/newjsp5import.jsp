<%-- 
    Document   : newjsp5import
    Created on : Aug 25, 2016, 3:14:10 PM
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
        <c:import var="mydata" url="/newjsp5display.jsp"/>
        <c:out value="${mydata}"/>
    </body>
</html>
