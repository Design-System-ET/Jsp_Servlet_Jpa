<%@page import="com.design_system.jsp_servlet_jpa.pojo.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuarios registrados</h1>
        
        <%
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for(Usuario usu:listaUsuarios){
        %>
        <p><b>Contador: <%=cont%></b></p>
        <p>Id: <%=usu.getId()%></p>
        <p>DNI: <%=usu.getDni()%></p>
        <p>Nombre: <%=usu.getNombre()%></p>
        <p>Apellido: <%=usu.getApellido()%></p>
        <p>Telefono: <%=usu.getTelefono()%></p>
        <%cont = cont + 1;%>
        <p>-------------------------------------------</p>
        
        <%}%>
        
    </body>
</html>
