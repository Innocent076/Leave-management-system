<%-- 
    Document   : add_employee
    Created on : 10 May 2025, 3:09:29 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add employee Page</title>
    </head>
    <body>
        <h1>Add employee</h1>
        <p>
            Please enter details of the employee
        </p>
        <form action = "AddEmployeeServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id" required=""/></td>
                </tr>
                <tr>
                    <td>Department:</td>
                    <td><input type="text" name="dept" required=""/></td>
                </tr>
                <tr>
                    <td>Salary:</td>
                    <td><input type="text" name="salary" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD EMPLOYEE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
