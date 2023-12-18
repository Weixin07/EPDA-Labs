<%-- 
    Document   : page2insert2
    Created on : Nov 1, 2023, 3:45:39 PM
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

<sql:update             
    dataSource="${data}"             
    var="new">            
    INSERT INTO mycustomer VALUES ('${param.name}',${param.balance},${param.password})        
</sql:update>
    
<sql:query             
    dataSource="${data}" 
    var="result">
    SELECT * from mycustomer
</sql:query>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
    </head>
    <body>
        <jsp:include page="page1insert1.jsp"/>
        <br><br>
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
    </body>
</html>
