<%-- 
    Document   : process
    Created on : Oct 12, 2023, 1:42:17 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page errorPage="error.jsp" %>

<%  
  
String num1=request.getParameter("x");  
String num2=request.getParameter("y");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
  
%>

<p></p>
<jsp:include page="calculation.jsp"/>