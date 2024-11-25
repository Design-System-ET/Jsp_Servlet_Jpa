package com.design_system.jsp_servlet_jpa.servlets;

import com.design_system.jsp_servlet_jpa.logica.Controladora;
import com.design_system.jsp_servlet_jpa.pojo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@WebServlet(name = "SVUsuario", urlPatterns = {"/SVUsuario"})
public class SVUsuario extends HttpServlet {

    //Instancia global de la controladora, asi la usan todos los metodos
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //creo una intancia de List para Usuarios
        List<Usuario> listaUsuarios = new ArrayList<>();
        
        //cargo la lista desde la BD usando el metodo del controlador
        listaUsuarios = control.traerUsuarios();
        
        //creo una instancia de la sesion para la respuesta
        HttpSession misesion = request.getSession();
        
        //creo un atributo y le asigno la instancia de sesion
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        //redirecciono a la vista, que se encarga de mostrar los datos
        response.sendRedirect("mostrarUsuarios.jsp");
        
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recibo la request y asigno los valores a variables
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        //creo una instancia de usuario
        Usuario usu = new Usuario();
        
        //creo un objeto de la isntancia de usuario con los valores de la request
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        
        //le envio el objeto a la controladora
        control.crearUsuario(usu);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
