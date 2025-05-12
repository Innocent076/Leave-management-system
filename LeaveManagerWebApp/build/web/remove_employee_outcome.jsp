<%-- 
    Document   : remove_employee_outcome
    Created on : 10 May 2025, 4:16:55 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Employee Outcome  Page</title>
    </head>
    <body>
        <h1>Remove employee outcome</h1>
        <%
                Long id = (Long)request.getAttribute("id");
        %>
        <p>
            The employee with id <b><%=id%></b> has been successfully removed.
        </p>
        <ul>
            <li><a href="index.html">Main page</a></li>
            <li><a href="menu.jsp">Menu page</a></li>
            <li><a href="LogOutServlet.do">Log out</a></li>
        </ul>
    </body>
</html>
