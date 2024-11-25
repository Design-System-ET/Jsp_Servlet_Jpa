package com.design_system.jsp_servlet_jpa.servlets;

import com.design_system.jsp_servlet_jpa.logica.Controladora;
import com.design_system.jsp_servlet_jpa.pojo.Usuario;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "SVActualizarUsuario", urlPatterns = {"/SVActualizarUsuario"})
public class SVActualizarUsuario extends HttpServlet {

    //instancio la controladora/logica
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recibo el parametro y lo asigno a una variable cambiandola de tipo
        int id = Integer.parseInt(request.getParameter("id"));
        
        //intancia de usuario y con la instancia de la controladora traigo el usuaio por el id
        Usuario usu = control.buscarUsuario(id);
        
        //creo una instancia de la sesion para la respuesta
        HttpSession misesion = request.getSession();
        
        //creo un atributo y le asigno la instancia de sesion
        misesion.setAttribute("usuariosID", usu);
        
        //redirecciono a la vista, que se encarga de mostrar los datos
        response.sendRedirect("editarUsuario.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recibo la request y asigno los valores a variables
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        //creo una instancia de usuario pero asignandole el de la sesion que ya trajimos
        Usuario usu = (Usuario) request.getSession().getAttribute("usuariosID");
        
        //creo un objeto de la isntancia de usuario con los valores de la request
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        
        //le envio el objeto a la controladora
        try {
            control.editarUsuario(usu);
        } catch (Exception ex) {
            Logger.getLogger(SVActualizarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
