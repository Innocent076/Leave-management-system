<%-- 
    Document   : display_highest_payed_employee_outcome
    Created on : 10 May 2025, 4:46:14 PM
    Author     : SIBUSISO
--%>

<%@page import="za.ac.tut.entity.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Highest Payed Employee Outcome Page</title>
    </head>
    <body>
        <h1>Display highest payed employee outcome</h1>
        <%
            Employee hEmp = (Employee)request.getAttribute("hpe");
            Long id = hEmp.getId();
            String dept = hEmp.getDept();
            String sal = hEmp.getSalary();
        %>
        <p>
            Below are the details of the highest payed employee.
        </p>
        <table>
            <tr>
                <td>ID:</td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Department:</td>
                <td><%=dept%></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><%=sal%></td>
            </tr>
        </table>
            <ul>
            <li><a href="index.html">Main page</a></li>
            <li><a href="menu.jsp">Menu page</a></li>
            <li><a href="LogOutServlet.do">Log out</a></li>
        </ul>
    </body>
</html>
