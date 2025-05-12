/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
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
public class AddEmployeeServlet extends HttpServlet {
    @EJB EmployeeFacadeLocal efl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String department = request.getParameter("dept");
        String salary = request.getParameter("salary");
        
        //create employee object
        Employee emp = createEmployee(id, department, salary);
        efl.create(emp);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_employee_outcome.jsp");
        disp.forward(request, response);
    }
    
   private Employee createEmployee(Long id,String dept,String sal){ 
       Employee emp = new Employee();
       emp.setId(id);
       emp.setDept(dept);
       emp.setSalary(sal);
       
       return emp;
   }
   
  

}
