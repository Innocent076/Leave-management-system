/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Leave;

/**
 *
 * @author pc
 */
@Local
public interface LeaveFacadeLocal {

    void create(Leave leave);

    void edit(Leave leave);

    void remove(Leave leave);

    Leave find(Object id);

    List<Leave> findAll();

    List<Leave> findRange(int[] range);

    int count();
    
    void createLeave(Leave leave);
    
    String getLeaveStatus(Long id);
    
    List<Leave> findPendingLeave();
    
}
