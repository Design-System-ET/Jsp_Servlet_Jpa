<%@page import="com.design_system.jsp_servlet_jpa.pojo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        
        <!-- aqui recibo los datos de la request cargados en la sesion -->
        
        <%Usuario usu = (Usuario) request.getSession().getAttribute("usuariosID");%>
        
        <h1>Editar Usuario</h1>
        
        <form action="SVActualizarUsuario" method="POST">
            <p><label>Id: </label><input type="text" name="id" value="<%=usu.getId()%>" readonly="true"></p>
            <p><label>Dni: </label><input type="text" name="dni" value="<%=usu.getDni()%>"></p>
            <p><label>Nombre: </label><input type="text" name="nombre" value="<%=usu.getNombre()%>"></p>
            <p><label>Apellido: </label><input type="text" name="apellido" value="<%=usu.getApellido()%>"></p>
            <p><label>Telefono: </label><input type="text" name="telefono" value="<%=usu.getTelefono()%>"></p>
            <button type="submit">Guardar</button>
        </form>
        
    </body>
</html>
