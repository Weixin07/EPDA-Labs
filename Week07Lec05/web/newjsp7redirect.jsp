<%-- 
    Document   : newjsp7redirect
    Created on : Aug 25, 2016, 3:30:42 PM
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
        <c:redirect url="/newjsp7.jsp" >
            <c:param name="UserId" value="222"/>
            <c:param name="UserName" value="ChaitanyaSingh"/>
        </c:redirect>
    </body>
</html>
