<%-- 
    Document   : home
    Created on : 6-Oct-2022, 9:45:41 AM
    Author     : Kyle Helmer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h3>G'day ${user.getUsername()}, you made it!</h3>
        <br>
        <a href="login?logout">Log Out</a>
    </body>
</html>
