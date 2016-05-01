/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.controller;

import java.util.Calendar;
import java.util.Locale;
import mackenzie.lp3.model.DAO.UsuarioDAO;
import mackenzie.lp3.model.Login;
import mackenzie.lp3.model.Usuario;

/**
 *
 * @author whoami
 */
public class Test {
    public static void main(String[] args) {
        Usuario a = new Usuario();
        a.setCpf("asd");
        a.setDataNascimento(Calendar.getInstance(Locale.ENGLISH));
        a.setEmail("asdas@asdas");
        a.setEndereco("aqui cuzao");
        
        Login log = new Login();
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
        
    }
    
}
