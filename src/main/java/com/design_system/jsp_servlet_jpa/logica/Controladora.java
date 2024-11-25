package com.design_system.jsp_servlet_jpa.logica;


import com.design_system.jsp_servlet_jpa.persistencia.ControladoraPersistencia;
import com.design_system.jsp_servlet_jpa.persistencia.exceptions.NonexistentEntityException;
import com.design_system.jsp_servlet_jpa.pojo.Usuario;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario (Usuario usu){
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios(){
        return controlPersis.traerUsuario();
    }
    
    public void eliminarUsuario(int id) throws NonexistentEntityException{
        controlPersis.eliminarUsuario(id);
    }
    
    public Usuario buscarUsuario(int id){
        return controlPersis.buscarUsuario(id);
    }

    public void editarUsuario(Usuario usu) throws Exception {
        controlPersis.editarUsuario(usu);
    }
}
