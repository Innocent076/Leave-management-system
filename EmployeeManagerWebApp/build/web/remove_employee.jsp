<%-- 
    Document   : remove_employee
    Created on : 10 May 2025, 3:14:00 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove employee Page</title>
    </head>
    <body>
        <h1>Remove employee</h1>
        <p>
            Please enter the ID of the employee you want to remove below:
        </p>
        <form action="RemoveEmployeeServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="REMOVE EMPLOYEE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
