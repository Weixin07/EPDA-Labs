<%-- 
    Document   : deposit
    Created on : Sep 25, 2023, 11:53:58 AM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <jsp:include page="link.jsp"/>
        <br><br><br>
        <form action="Deposit" method="POST">
            Deposit amount: <input type="text" name="x" size="20">
            <p><input type="submit" value="Deposit"></p>
        </form>
    </body>
</html>
