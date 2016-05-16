<%-- 
    Document   : home
    Created on : May 16, 2016, 3:46:00 AM
    Author     : whoami
--%>

<%@page import="mackenzie.lp3.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
    </head>
    <body>
        <% Usuario u = (Usuario)session.getAttribute("usuario");%>
        <h1>bem vindo <%=u.getNome()%></h1>
        
        
    </body>
</html>
