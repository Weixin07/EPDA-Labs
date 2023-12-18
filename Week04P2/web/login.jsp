<%-- 
    Document   : login
    Created on : Sep 25, 2023, 11:26:35 AM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="x" size="20"></td>
                </tr>
                <tr>
                    <td>Balance: </td>
                    <td><input type="text" name="y" size="20"></td>
                </tr>
            </table>
            <p><input type="submit" value="Login"></p>
        </form>
    </body>
</html>
