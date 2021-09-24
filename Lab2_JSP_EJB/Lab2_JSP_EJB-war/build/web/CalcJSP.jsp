<%-- 
    Document   : CalcJSP
    Created on : Sep 18, 2021, 2:08:35 PM
    Author     : edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora JSP</title>
    </head>
    <body>
        <form action="./CalcServlet" method="POST">
            <p><input type="text" name="n1" />
            <input type="text" name="n2" /></p>
            <input type="submit" value="+" name="action" />
            <input type="submit" value="-" name="action" />
            <input type="submit" value="*" name="action" />
            <input type="submit" value="/" name="action" />
            <input type="submit" value="%" name="action" />
            <input type="submit" value="^" name="action" />
        </form>
    </body>
</html>
