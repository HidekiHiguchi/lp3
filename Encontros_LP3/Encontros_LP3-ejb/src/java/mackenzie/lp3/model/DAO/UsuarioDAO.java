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

/**
 *
 * @author whoami
 */
public class UsuarioDAO implements GenericDAO{

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
    public void insert(Object a) {
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
    public void update(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List read(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
