<%-- 
    Document   : newjsp4token
    Created on : Aug 25, 2016, 3:12:19 PM
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
        <c:forTokens items="Zara,nuha,roshy" delims="," var="name">
            <c:out value="${name}"/><p>
        </c:forTokens>
    </body>
</html>
