<%-- 
    Document   : error
    Created on : Oct 12, 2023, 1:42:37 PM
    Author     : guan.kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page isErrorPage="true" %> 

<h3>Sorry an exception occurred!</h3>  
  
Exception is: <%= exception %>

<p></p>
<jsp:include page="calculation.jsp"/>
