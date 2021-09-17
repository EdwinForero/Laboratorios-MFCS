<%-- 
    Document   : response
    Created on : Sep 17, 2021, 1:55:30 PM
    Author     : edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        <jsp:useBean id="myBean" scope="session" class="co.edu.unipiloto.NameHandler" />
        <jsp:setProperty name="myBean" property="name"/>
        <jsp:setProperty name="myBean" property="edad" />
        
        <h1><jsp:getProperty name="myBean" property="name" /></h1>
        <h1><jsp:getProperty name="myBean" property="edad" /></h1>
    </body>
</html>
