<%-- 
    Document   : newjsp1catch
    Created on : Aug 25, 2016, 3:04:30 PM
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
        <%=10/0%>
        <%--<c:catch>
            <%=10/0%>  
        </c:catch>--%>
        <c:catch>
            <%=10/2%>  
        </c:catch>
    </body>
</html>
