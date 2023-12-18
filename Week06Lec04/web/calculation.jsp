<%-- 
    Document   : calculation
    Created on : Oct 12, 2023, 1:34:22 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <form action="process.jsp">
        <%--<form action="NewServlet">--%>
            Numerator: <input type="text" name="x" /><br/><br/>  
            Denominator: <input type="text" name="y" /><br/><br/>  
            <input type="submit" value="Divide"/>  
        </form>
    </body>
</html>
