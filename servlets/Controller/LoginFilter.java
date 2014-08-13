/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author webonise
 */
public class LoginFilter implements Filter {
    
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    /* This works as checkpoint(a filter) before calling servlet Login.java */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        String id= request.getParameter("id");
        String password= request.getParameter("password");
        
        if(!id.equals("admin777")){
            /* stops from moving forward as entered credential is incorrect*/
            RequestDispatcher r= request.getRequestDispatcher("error.jsp");
            r.forward(request, response);
        }
        else{
            /* continues normal flow if credentials are correct */
            chain.doFilter(request, response);
        }
  
    }
    
    public void destroy() {        
    }

  
}
 
