/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model.DAO;

import java.util.List;
import javax.ejb.Remote;
import javax.persistence.EntityManager;

/**
 *
 * @author whoami
 * @param <T>
 */
@Remote
public interface GenericDAORemote<T> {
    
    public EntityManager getEM();
    public void insert(T a);
    public void update(T a);
    public void delete(T a);
    public List<T> readAll();
    public List<T> read(T a);
    
}
