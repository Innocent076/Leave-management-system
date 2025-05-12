<%-- 
    Document   : access_denied
    Created on : 11 May 2025, 6:05:07 PM
    Author     : SIBUSISO
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Denied Page</title>
    </head>
    <body>
        <h1>Access denied</h1>
        <%
            session.invalidate();
        %>
        <p>
            You are not allowed to access the requested resource.<br/>
            Please click <a href="index.html">here</a> to go to main page.
        </p>
    </body>
</html>
