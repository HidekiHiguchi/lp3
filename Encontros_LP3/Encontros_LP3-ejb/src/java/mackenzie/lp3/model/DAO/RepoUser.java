/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model.DAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import mackenzie.lp3.model.Login;
import mackenzie.lp3.model.Usuario;

/**
 *
 * @author whoami
 */
@Singleton(mappedName = "RepositorioUser")
@LocalBean
public class RepoUser implements RepoUserRemote{
    
    private List<Usuario>usuarios;
    
    @PostConstruct
    private void init(){
        this.usuarios = new ArrayList<>();
        Usuario a = new Usuario();
        Login log = new Login();
        a.setCpf("asd");
        a.setDataNascimento(Calendar.getInstance(Locale.ENGLISH));
        a.setEmail("asdas@asdas");
        a.setEndereco("aqui cuzao");
        
        log.setPassword("pass");
        log.setTipo(1);
        log.setUsername("Hideki");
        a.setLogin(log);
        
        a.setNome("Hideki Higuchi");
        a.setRg("123567");
        a.setSexo("masc");
        a.setTelefone("119811689604");
        
        UsuarioDAO dao = new UsuarioDAO();
        dao.insert(a);
        
        this.usuarios.add(a);
    }
    
    public void addUser(Usuario u){
        this.usuarios.add(u);
    }
    
    public Usuario getUser(Usuario u){
        for (Usuario usuario : usuarios) {
            if(usuario.getLogin().getUsername().equalsIgnoreCase(u.getLogin().getUsername()))
                return usuario;
        }
        return null;
    }
    
}
