<%-- 
    Document   : login
    Created on : Sep 25, 2023, 10:53:33 AM
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
        <form method="POST">
            <table>
                <tr>
                    <td>Username: </td><td><input type="text" name="x" size="20"></td>
                </tr>
                <tr>
                    <td>Password: </td><td><input type="text" name="y" size="20"></td>
                </tr>
            </table>
            <p><input type="submit" value="Login"></p>
        </form>
        <%
            if((request.getParameter("x")!=null) && request.getParameter("x").length()>0){
                if(request.getParameter("y").equals("12345")){
        %>
                    <jsp:forward page="Welcome"/>
        <%
                } else{
        %>
                    <jsp:include page="wrong.jsp"/>
        <%
                }
            }
        %>
    </body>
</html>
