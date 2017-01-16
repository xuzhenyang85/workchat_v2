package app.result;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.data.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Peter
 */
@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");
            
            out.println("<meta charset='UTF - 8'>");
            out.println("<meta name='viewport' content='width = device - width, initial - scale = 1.0'>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/css/reset.css'>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/css/bootstrap-theme.css'>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/css/bootstrap.css'>");

            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container-fluid'>");
            out.println("<div class='row'>");
            out.println("<nav class='navbar navbar-default'>");
            out.println("<div class='container-fluid'>");

            out.println("<div class='navbar-header'>");
            out.println("<button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'>");
            out.println("<span class='sr-only'>Toggle navigation</span>");
            out.println("<span class='icon-bar'></span>");
            out.println("<span class='icon-bar'></span>");
            out.println("<span class='icon-bar'></span>");
            out.println("</button>");
            out.println("<a class='navbar-brand' href='#'>WORKGROUP</a>");
            out.println("</div>");

            out.println("<div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>");
            out.println("<ul class='nav navbar-nav navbar-right'>");
            out.println("<li><a href='#'>Link</a></li>");
            out.println("<li class='dropdown'>");
            out.println("<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Dropdown <span class='caret'></span></a>");
            out.println("<ul class='dropdown-menu'>");
            out.println("<li><a href='#'>Action</a></li>");
            out.println("<li><a href='#'>Another action</a></li>");
            out.println("<li><a href='#'>Something else here</a></li>");
            out.println("<li role='separator' class='divider'></li>");
            out.println("<li><a href='#'>Separated link</a></li>");
            out.println("</ul>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div><!-- /.navbar-collapse -->");
            out.println("</div><!-- /.container-fluid -->");
            out.println("</nav>");
            out.println("</div>");
            out.println("<div class='row'>");
            out.println("<div class='col-md-4 col-md-offset-4'>");
            out.println("<div class='panel panel-default'>");
            out.println("<div class='panel-heading'>Login</div>");

            out.println("<div class='panel-body'>");
            out.println("<div class='col-md-12'>");
            out.println("<form action='loginServlet'  method='POST'>");
            out.println("<div class='form-group'>");
            out.println("<label for='emailInput'>Email</label>");
            out.println("<input type='email' class='form-control' id='emailInput' placeholder='Email'>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='passwordInput'>Password</label>");
            out.println("<input type='password' class='form-control' id='passwordInput' placeholder='Password'>");
            out.println("</div>");
            out.println("<button type='submit' class='btn btn-success col-md-5'>New user? Click here!</button>");
            out.println("<button tyoe='submit' class='btn btn-primary col-md-5 col-md-offset-2'>Submit</button>");
            out.println("</form>");

            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
       
     public void checkUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String password;
        String email;
        
        try {
            
            password = request.getParameter("password");
            email = request.getParameter("email");
        
        } catch (NumberFormatException ex) {
            password = null;
            email = null;
        }
        if (email.isEmpty() || password.isEmpty()) {
            response.sendRedirect("loginServlet");
        }
        }
//        public void processLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.getSession().setAttribute("email", request);
//        request.getSession().setAttribute("password", request);
//    }
        
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
