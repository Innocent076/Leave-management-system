/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Leave;

/**
 *
 * @author pc
 */
@Stateless
public class LeaveFacade extends AbstractFacade<Leave> implements LeaveFacadeLocal {

    @PersistenceContext(unitName = "LeaveManagementEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LeaveFacade() {
        super(Leave.class);
    }

    @Override
    public void createLeave(Leave leave) {
        create(leave);
    }

    @Override
    public String getLeaveStatus(Long id) { 
        
        Query query = em.createQuery("SELECT l.status.name FROM LeaveRequest l WHERE l.id = :id");
        query.setParameter("id", id);
        String status = (String)query.getSingleResult();
        return status;
    }

    @Override
    public List<Leave> findPendingLeave() {
        
        Query query = em.createQuery("SELECT l FROM Leave l WHERE l.status.name = :statusName");
        query.setParameter("statusName", "PENDING");
        
        return query.getResultList();
    }
    
}
