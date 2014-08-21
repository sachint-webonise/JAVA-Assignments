/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PersonDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mybean.Person;
import mybean.Vehicle;

/**
 *
 * @author webonise
 */
public class PersonServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = Integer.parseInt(request.getParameter("id"));
            String username = request.getParameter("username");
            int age = Integer.parseInt(request.getParameter("age"));
            String city = request.getParameter("city");
            String vehicleid[] = request.getParameterValues("vehicleid");
            String vehiclename[] = request.getParameterValues("vehiclename");
            int numberofvehicle = vehicleid.length;
            HashSet<Vehicle> vehicleset = new HashSet<>();
            
            for(int i=0; i< numberofvehicle; i++){
                Vehicle v = new Vehicle();
                v.setNumber(Integer.parseInt(vehicleid[i]));
                v.setName(vehiclename[i]);
                vehicleset.add(v);
            }
            
            Person person = new Person();
            person.setAge(age);
            person.setCity(city);
            person.setId(id);
            person.setUsername(username);
            person.setVehicles(vehicleset);
            
            PersonDAO pd = new PersonDAO();
            Integer i = pd.addPerson(person);
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
