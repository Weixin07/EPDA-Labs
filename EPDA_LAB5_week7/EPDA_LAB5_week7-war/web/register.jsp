<%-- 
    Document   : login
    Created on : Oct 2, 2023, 11:06:58 AM
    Author     : TP060637
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <a href="login.jsp">Login Page</a>
        <br><br><br>
        <form action="Register" method="POST">
            <table>
                <tr>
                    <td>Username: </td><td><input type="text" name="x" size="20"></td>
                </tr>
                
                <tr>
                    <td>Password: </td><td><input type="text" name="y" size="20"></td>
                </tr>
                
                <tr>
                    <td>Balance: </td><td><input type="text" name="z" size="20"></td>
                </tr>
            </table>
            <p><input type="submit" value="Register"></p>
        </form>
    </body>
</html>
