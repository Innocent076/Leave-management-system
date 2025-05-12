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
import za.ac.tut.model.bl.UserFacadeLocal;
import za.ac.tut.model.entity.User;

/**
 *
 * @author SIBUSISO
 */
public class CreateUserServlet extends HttpServlet {
    @EJB UserFacadeLocal ufl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uName = request.getParameter("name");
        String pswd = request.getParameter("pswd");
        String role = request.getParameter("role");
        
        User user = new User();
        user.setUserName(uName);
        user.setPassword(pswd);
        user.setRole(role);
        
        ufl.create(user);
        
        RequestDispatcher disp = request.getRequestDispatcher("");
        disp.forward(request, response);
    }
}
