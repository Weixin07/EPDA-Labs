<%-- 
    Document   : newjsp
    Created on : Nov 16, 2023, 2:18:59 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
<%--         <form action="StatefulServlet" method="POST">--%>
       <form action="StatelessServlet" method="POST">
            Enter a value: <input type="text" name="x" size="20">
            <p><input type="submit" value="Add"></p>
        </form>
    </body>
</html>
