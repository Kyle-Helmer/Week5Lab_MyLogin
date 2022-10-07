<%-- 
    Document   : login
    Created on : 6-Oct-2022, 9:45:36 AM
    Author     : Kyle Helmer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="get">
        Username:<input type="text" name="username" value="${username}">
        <br>
        Password:<input type="text" name="password" value="${password}">
        <br>
        <input type="submit" value="Log in">
    </body>
</html>
