<%-- 
    Document   : newjsp6param
    Created on : Aug 25, 2016, 3:19:00 PM
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
        <a href="<c:url value="/NewServlet6">
           <c:param name="firstName" value="Sina" />
           <c:param name="surname" value="Jamoly" />
           </c:url>
        ">TEST</a>
    </body>
</html>
