/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.service;

import javax.ejb.Remote;
import mackenzie.lp3.model.Usuario;

/**
 *
 * @author whoami
*/
    
@Remote
public interface UserBeanRemote {
     
    public Usuario getUser(String login);
    public Usuario doLogin(Usuario u);
    public void addUser(Usuario u);
    public void removeUser(Usuario u);
    public void updateUser(Usuario u);
    
    
}
   
