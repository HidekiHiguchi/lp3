/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.controller;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mackenzie.lp3.model.Usuario;
import mackenzie.lp3.service.UserBeanRemote;

/**
 *
 * @author whoami
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login = request.getParameter("username");
        String senha = request.getParameter("password");
        
        String pagina = "login.jsp";
        Usuario aux = new Usuario();
        aux.setNome("Meu nome");
        aux.setPassword("1234");
        aux.setUsername("hideki");
        aux.setTipo(1);
        UserBeanRemote userBean = null;
        Usuario u = null;
        
        try {
            userBean = (UserBeanRemote)InitialContext.doLookup("UserBean");

            u = userBean.doLogin(aux);
            
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
        //se for diferente de nulo, é porque o login foi executado com sucesso
        if(true){
            request.getSession().setAttribute("usuario", u);
            pagina = "home.jsp";
            
        }
        
        response.sendRedirect(pagina);
            
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
