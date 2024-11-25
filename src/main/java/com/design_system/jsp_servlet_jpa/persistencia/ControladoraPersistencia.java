package com.design_system.jsp_servlet_jpa.persistencia;

import com.design_system.jsp_servlet_jpa.persistencia.exceptions.NonexistentEntityException;
import com.design_system.jsp_servlet_jpa.pojo.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //Operacion CREATE
    public void crearUsuario(Usuario usu){
        usuJpa.create(usu);
    }
    
    //Operacion READ
    public List<Usuario> traerUsuario(){
        return usuJpa.findUsuariosEntities();
    }
    
    //Operacion de eliminacion
    public void eliminarUsuario(int id) throws NonexistentEntityException{
        usuJpa.destroy(id);
    }
    
    //Operacion buscar usuario por id
    public Usuario buscarUsuario(int id){
        return usuJpa.findUsuarios(id);
    }

    public void editarUsuario(Usuario usu) throws Exception {
        usuJpa.edit(usu);
    }
}
