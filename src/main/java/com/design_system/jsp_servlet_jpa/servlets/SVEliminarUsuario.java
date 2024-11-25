package com.design_system.jsp_servlet_jpa.servlets;

import com.design_system.jsp_servlet_jpa.logica.Controladora;
import com.design_system.jsp_servlet_jpa.persistencia.exceptions.NonexistentEntityException;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "SVEliminarUsuario", urlPatterns = {"/SVEliminarUsuario"})
public class SVEliminarUsuario extends HttpServlet {
    
    //Instancia global de la controladora, asi la usan todos los metodos
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recibo el parametro y lo convierto a int
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        //aqui no creo instancia de usuario
            
        //instancia de la controladora de logica
        try {
            control.eliminarUsuario(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(SVEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
