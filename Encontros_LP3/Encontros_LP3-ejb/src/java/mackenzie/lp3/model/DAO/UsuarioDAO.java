/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mackenzie.lp3.model.Usuario;

/**
 *
 * @author whoami
 */
public class UsuarioDAO implements GenericDAORemote<Usuario>{

    @Override
    public EntityManager getEM() {
        try {
            EntityManagerFactory em = Persistence.createEntityManagerFactory("EncontroPU");
            EntityManager entity = em.createEntityManager();        
            return entity;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void insert(Usuario a) {
        try {
            EntityManager em = getEM();
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            System.out.println("Commited");
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Usuario a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List read(Usuario a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Usuario getUser(Usuario u) {
        return null;
        
    }

    
    
}
