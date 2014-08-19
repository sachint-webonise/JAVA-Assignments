package controller;

import MyBean.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmployeeMasterDAO;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet.do"})
public class EmployeeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            int id = Integer.parseInt(request.getParameter("id"));
            String username = request.getParameter("username");
            int age = Integer.parseInt(request.getParameter("age"));
            String city = request.getParameter("city");
            String project = request.getParameter("project");

            Employee l = new Employee();
            l.setId(id);
            l.setUsername(username);
            l.setAge(age);
            l.setCity(city);
            l.setProject(project);

            EmployeeMasterDAO d = new EmployeeMasterDAO();
            boolean isRegistered = d.addEmployee(l);

            request.setAttribute("username", username);
            RequestDispatcher view = request.getRequestDispatcher("afterregister.jsp");
            view.forward(request, response);
            if (isRegistered) {
                System.out.println("Registered Successfully");
            } else {
                System.out.println("Unsuccessful");
            }

        } finally {
            out.close();
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
