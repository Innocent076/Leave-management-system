/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entity.Employee;

/**
 *
 * @author SIBUSISO
 */
@Stateless
@DeclareRoles({"manager", "secretary"})
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "EmployeeManagerEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }
    

    @Override
    @RolesAllowed("manager")
    public List<Employee> displayFromDept(String dept) {
        String qryStr = "SELECT e FROM Employee e WHERE e.dept = ?1";
        Query qry = em.createQuery(qryStr);
        qry.setParameter(1, dept);
        List<Employee> emps = qry.getResultList();
        return emps;
    }

    @Override
    @RolesAllowed("manager")
    public Employee displayHighestPaid(String dept) {
     String qryStr = "SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2 WHERE e2.dept = :dept) AND e.dept = :dept";
    Query qry = em.createQuery(qryStr);
    qry.setParameter("dept", dept);
    Employee emp = (Employee) qry.getSingleResult();
    return emp;
    }

    @Override
    public void deleteEmployee(Long id) {
        String qryStr = "DELETE FROM Employee c WHERE e.id = ?1";
        Query qry = em.createQuery(qryStr);
        qry.setParameter(1, id);
        qry.executeUpdate();
    }

    @RolesAllowed("secretary")
    @Override
    public void create(Employee employee) {
        super.create(employee);
    }
    
    @Override
    @RolesAllowed("manager")
    public void remove(Employee emp) {
        super.remove(emp);
    }
    
}
