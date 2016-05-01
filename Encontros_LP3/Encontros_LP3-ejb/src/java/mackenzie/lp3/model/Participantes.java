/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author whoami
 */
public class Participantes implements Serializable{
    private List<Usuario> participantes;

    public Participantes() {
    }
    
    public boolean removeUser(Usuario a){
        return true;
    }
    
    public boolean addUser(Usuario a){
        return true;
    }
    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }
    
    
}
