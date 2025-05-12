/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.EmployeeFacadeLocal;
import za.ac.tut.entity.Employee;

/**
 *
 * @author SIBUSISO
 */
public class DisplayEmployeeFromDepartmentServlet extends HttpServlet {
    @EJB EmployeeFacadeLocal efl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dept = request.getParameter("dept");
        
        List<Employee> emps = efl.displayFromDept(dept);
        
        request.setAttribute("emps", emps);
        request.setAttribute("dept", dept);
        
        RequestDispatcher disp = request.getRequestDispatcher("display_from_department_outcome.jsp");
        disp.forward(request, response);
    }

}
