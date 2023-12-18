<%-- 
    Document   : page7delete1
    Created on : Nov 1, 2023, 4:11:06 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 

<sql:setDataSource 
    var="data" 
    driver="org.apache.derby.jdbc.ClientDriver"     
    url="jdbc:derby://localhost:1527/sample"
    user="app"  
    password="app"/> 

<sql:query             
    dataSource="${data}" 
    var="result">
    SELECT * from mycustomer
</sql:query>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Page</title>
    </head>
    <body>
        <table border="1" width="100%">
            <tr>
                <th>Name</th>
                <th>Password</th>
                <th>Balance</th>
            </tr>
            <c:forEach items="${result.rows}" var="row">
                <tr>
                    <td><c:out value="${row.id}"/></td>
                    <td><c:out value="${row.password}"/></td>
                    <td><c:out value="${row.balance}"/></td>
                </tr>
            </c:forEach>
        </table> 
        <br><br><br>
        Please enter the customer name you want to delete:
        <br><br>
        <form action="page8delete2.jsp">
            Customer Name: <input type="text" name="name" size="20">
            <p>
                <input type="submit" value="Delete">
            </p>
        </form> 
    </body>
</html>
