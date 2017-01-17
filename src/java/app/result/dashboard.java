/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.result;

import app.data.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author danny
 */
@WebServlet(name = "dashboard", urlPatterns = {"/dashboard"})
public class dashboard extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String email = (String) request.getSession().getAttribute("email");

            String myUrl = request.getContextPath();
            System.out.println(myUrl);
            if (email == null) {
                response.sendRedirect("error.html");
            } else {

                out.println("<!DOCTYPE html>");
                out.println("<head>");
                out.println("<title>TODO supply a title</title>");
                out.println("<meta charset='UTF-8'>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                out.println("<link rel='stylesheet' type='text/css' href='css/reset.css'>");
                out.println("<link rel='stylesheet' type='text/css' href='css/bootstrap-theme.css'>");
                out.println("<link rel='stylesheet' type='text/css' href='css/bootstrap.css'>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>");
                out.println("<script src='js/bootstrap.js'></script> ");

                out.println("<script>");
                out.println("$('#home a').click(function (e) {");
                out.println("e.preventDefault();");
                out.println("$(this).tab('show');");
                out.println("});");
                out.println("$('#profiles a').click(function (e) {");
                out.println("e.preventDefault();");
                out.println("$(this).tab('show');");
                out.println("});");
                out.println("$('#messages a').click(function (e) {");
                out.println("e.preventDefault();");
                out.println("$(this).tab('show');");
                out.println("});");
                out.println("$('#settings a').click(function (e) {");
                out.println("e.preventDefault();");
                out.println("$(this).tab('show');");
                out.println("});");
                out.println("</script>");
                out.println("</head>");
                out.println("<body>");

                out.println(" <div class='container-fluid'><div class='row'>");
                out.println(" <nav class='navbar navbar-default'>");
                out.println("  <div class='container-fluid'>");
                out.println("  <div class='navbar-header'>");
                out.println("<button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'>");
                out.println("<span class='sr-only'>Toggle navigation</span>");
                out.println(" <span class='icon-bar'></span>");
                out.println(" <span class='icon-bar'></span>");
                out.println(" <span class='icon-bar'></span>");
                out.println(" </button>");
                out.println("   <a class='navbar-brand' href='#'>WORKGROUP - " + email + "</a>");
                out.println("   </div>");

                out.println("  <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-'>");
                out.println("<ul class='nav navbar-nav navbar-right'>");
                out.println("<form action='logout' method='POST'>");
                out.println("  <li><button type='submit'>Log out</button></li>");
                out.println("</form>");

                out.println("  <li class='dropdown'>");
                out.println("  <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Dropdown <span class='caret'></span></a>");
                out.println("  <ul class='dropdown-menu'>");
                out.println("    <li><a href='#'>Action</a></li>");
                out.println("    <li><a href='#'>Another action</a></li>");
                out.println("   <li><a href='#'>Something else here</a></li>");
                out.println("    <li role='separator' class='divider'></li>");
                out.println(" <li><a href='#'>Separated link</a></li>");
                out.println("   </ul>");
                out.println(" </li>");
                out.println("  </ul>");
                out.println("    </div><!-- /.navbar-collapse -->");
                out.println("  </div><!-- /.container-fluid -->");
                out.println(" </nav>");
                out.println(" </div>");
                out.println("  <div class='row'>");

                out.println("  <div class='col-md-4 col-md-offset-4'>");
                out.println("   <div>");
                out.println(" <!-- Nav tabs -->");
                out.println("    <ul class='nav nav-tabs' role='tablist'>");
                out.println("    <li role='presentation' class='active'><a href='#home' aria-controls='home' role='tab' data-toggle='tab'>All rooms</a></li>");
                out.println("    <li role='presentation'><a href='#profile' aria-controls='profile' role='tab' data-toggle='tab'>My rooms</a></li>");
                out.println("    <li role='presentation'><a href='#messages' aria-controls='messages' role='tab' data-toggle='tab'>Create room</a></li>");
                out.println("</ul>");

                out.println(" <!-- Tab panes -->");
                out.println("<div class='tab-content'>");
                out.println("  <div role='tabpanel' class='tab-pane active' id='home'>");
                out.println("   <div class='list-group'>");
                out.println("      <a href='room.html' class='list-group-item'>");
                out.println("         <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("          <p class='list-group-item-text'>...</p>");
                out.println("     </a>");
                out.println("     <a href='room.html' class='list-group-item'>");
                out.println("     <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("       <p class='list-group-item-text'>...</p>");
                out.println("    </a>");
                out.println("    <a href='room.html' class='list-group-item'>");
                out.println("       <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("        <p class='list-group-item-text'>...</p>");
                out.println("   </a>");
                out.println("    <a href='room.html' class='list-group-item'>");
                out.println("      <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("       <p class='list-group-item-text'>...</p>");
                out.println("  </a>");
                out.println("   <a href='room.html' class='list-group-item'>");
                out.println("      <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("      <p class='list-group-item-text'>...</p>");
                out.println("   </a>");
                out.println("    <a href='room.html' class='list-group-item'>");
                out.println("        <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("        <p class='list-group-item-text'>...</p>");
                out.println("      </a>");
                out.println("   </div>");
                out.println(" </div>");
                out.println(" <div role='tabpanel' class='tab-pane' id='profile'>");
                out.println("    <a href='room.html' class='list-group-item'>");
                out.println("         <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("       <p class='list-group-item-text'>...</p>");
                out.println("    </a>");
                out.println("    <a href='room.html' class='list-group-item'>");
                out.println("       <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("       <p class='list-group-item-text'>...</p>");
                out.println("   </a>");
                out.println("   <a href='room.html' class='list-group-item'>");
                out.println("       <h4 class='list-group-item-heading'>List group item heading</h4>");
                out.println("       <p class='list-group-item-text'>...</p>");
                out.println("    </a></div>");
                out.println(" <div role='tabpanel' class='tab-pane' id='messages'>Create room</div>");
                out.println(" </div>");
                out.println("  </div>");
                out.println(" </div>");
                out.println("  </div>");
                out.println("  </div>");
                out.println("  </body>");
                out.println("</html>");
            }
        }
    }
    
    public void allRooms() {
        DAO dao = new DAO();
        
        dao.checkAllGroups(0, 0);
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
