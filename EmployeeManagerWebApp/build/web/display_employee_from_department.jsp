<%-- 
    Document   : display_employee_from_department
    Created on : 10 May 2025, 3:19:09 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Employees From Specific Department Page</title>
    </head>
    <body>
        <h1>Display employees from a specific department</h1>
        <p>
            Enter the department name you want employees from
        </p>
        <form action="DisplayEmployeeFromDepartmentServlet.do" method="POST">
            <table>
                <tr>
                    <td>Department:</td>
                    <td><input type="text" name="dept" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="VIEW EMPLOYEES"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
