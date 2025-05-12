<%-- 
    Document   : display_from_department_outcome
    Created on : 10 May 2025, 4:26:16 PM
    Author     : SIBUSISO
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display From Department Outcome Page</title>
    </head>
    <body>
        <h1>Display from department outcome</h1>
        <%
                List<Employee> emps = (List<Employee>)request.getAttribute("emps");
                String dispDept = (String)request.getAttribute("dept");
                if(!emps.isEmpty()){
                    %>
                    <p>
                        Below are the details of the employees under depertment <b><%=dispDept%></b> in the database
                    </p>  
                    
                    <table border = "1">
                        <tr>
                            <th>No.</th>
                            <th>Id number</th>
                            <th>Department name</th>
                            <th>Salary</th>
                        </tr>
                        <%
                                for(int i = 0;i < emps.size();i++){
                                    Employee emp = emps.get(i);
                                    Long id = emp.getId();
                                    String dept = emp.getDept();
                                    String sal = emp.getSalary();
                            %>
                            <tr>
                                <td><%=i+1%></td>
                                <td><%=id%></td>
                                <td><%=dept%></td>
                                <td><%=sal%></td>
                            </tr>
                            <%    }
                        %>
                    </table>
                <%}else{
                %>
                <p>
                    There are currently no employees under department <b><%=dispDept%></b> on the database.<br/>
                </p>    
                <%}        
        %>
        
        <ul>
            <li><a href="index.html">Main page</a></li>
            <li><a href="menu.jsp">Menu page</a></li>
            <li><a href="LogOutServlet.do">Log out</a></li>
        </ul>
        
        
    </body>
</html>
