<%-- 
    Document   : wrong
    Created on : Sep 25, 2023, 11:05:47 AM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <br><br><br>Sorry <%= request.getParameter("x") %>, wrong password!
                
    </body>
</html>
