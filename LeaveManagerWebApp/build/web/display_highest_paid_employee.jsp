<%-- 
    Document   : display_highest_paid_employee
    Created on : 10 May 2025, 5:58:30 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Highest Paid Employee Page</title>
    </head>
    <body>
        <h1>Display highest paid employee</h1>
        <p>
            Please enter department name:
        </p>
        <form action="DisplayHighestPaidEmployeeServlet.do" method="POST">
            <table>
                <tr>
                    <td>Department name:</td>
                    <td><input type="text" name="dept" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET HIGHEST PAID EMPLOYEE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
