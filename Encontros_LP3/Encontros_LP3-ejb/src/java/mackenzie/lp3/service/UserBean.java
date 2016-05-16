/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mackenzie.lp3.model.DAO.UsuarioDAO;
import mackenzie.lp3.model.Usuario;


@EJB
@Stateless(mappedName = "UserBean")
@LocalBean
public class UserBean implements UserBeanRemote{
    

    private UsuarioDAO userDAO;


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Usuario doLogin(Usuario u) {
        if(u.getUsername() != null && !u.getUsername().equalsIgnoreCase("") ){
            Usuario usuario = userDAO.getUser(u);
            if(usuario.getPassword().equalsIgnoreCase(u.getPassword()))
                return usuario;
        }
        return null;
    }

    @Override
    public void addUser(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeUser(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getUser(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}