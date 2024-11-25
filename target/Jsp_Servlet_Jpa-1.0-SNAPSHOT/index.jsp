<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Agregar Usuario</h1>
        
        <form action="SVUsuario" method="POST">
            <p><label>Dni: </label><input type="text" name="dni"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <br>
        <hr>
        
        
        <h1>Listado de Usuarios</h1>
        
        <form action="SVUsuario" method="GET">
            <button type="submit"> Mostrar Usuarios</button>
        </form>
        
        <br>
        <hr>
        
        <h1>Elimino un usuario</h1>
        
        <form action="SVEliminarUsuario" method="POST">
            <p>Indique el ID del usuario que quiere eliminar</p>
            <p><label>ID: </label><input type="text" name="id"></p>
            <button type="submit">Eliminar</button>
        </form>
        
        <br>
        <hr>
        
        <h1>Editar Usuario</h1>
        <p>Ingrese el ID del usuario a actualizar</p>
        <form action="SVActualizarUsuario" method="GET">
            <p><label>Id: </label> <input type="text" name="id"></p>
            <button type="submit">Buscar usuario por ID</button>
        </form>
        
    </body>
</html>
