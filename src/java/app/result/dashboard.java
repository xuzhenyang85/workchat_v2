/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package app.result;
 
import app.data.DAO;
import app.user.Group;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet(name = "dashboard", urlPatterns
        = {
            "/dashboard"
        })
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
    private String email;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            email = (String) request.getSession().getAttribute("email");
 
            if (email == null) {
                response.sendRedirect("login.html");
            } else {
 
                myRooms();
 
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
                out.println("  <div class='container-fluid'>"
                + "                        <div class='navbar-header'> "
                        + "                            <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'>"
                        + "                                <span class='sr-only'>Toggle navigation</span> "
                        + "                                <span class='icon-bar'></span> "
                        + "                                <span class='icon-bar'></span> "
                        + "                                <span class='icon-bar'></span> "
                        + "                            </button> "
                        + "                            <a class='navbar-brand' href='index.html''><img alt='' src='img/logo.gif' width='50' height='50' style='margin-top: -15px;'' ></a> </div>"
                        + " "
                        + "                        <!-- Collect the nav links, forms, and other content for toggling --> ");
 
                out.println("  <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-'>");
                out.println("<ul class='nav navbar-nav navbar-right'>");
                out.println("  <li><a href='javascript: history.go(-1)'>Back</a></li>");
 
                out.println("  <li class='dropdown'>");
                out.println("  <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Setting<span class='caret'></span></a>");
                out.println("  <ul class='dropdown-menu'>");
                out.println("    <li><a href='create.html'>Sign in</a></li>");
                out.println("    <li><a href='info.html'>About us</a></li>");
                out.println("   <li><a href='logout'>Log out</a></li>");
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
                out.println("    <li role='presentation' class='active'><a href='#home' aria-controls='home' role='tab' data-toggle='tab'>All groups</a></li>");
                out.println("    <li role='presentation'><a href='#profile' aria-controls='profile' role='tab' data-toggle='tab'>My groups</a></li>");
                out.println("    <li role='presentation'><a href='#messages' aria-controls='messages' role='tab' data-toggle='tab'>Create group</a></li>");
                out.println("</ul>");
 
                out.println(" <!-- Tab panes -->");
                out.println("<div class='tab-content'>");
                out.println("  <div role='tabpanel' class='tab-pane active' id='home'>");
                out.println("   <div class='list-group'>");
 
                DAO dao = new DAO();
                ArrayList<Group> groups = new ArrayList<>();
                groups = dao.getAllGroups();
 
                for (int i = 0; i < groups.size(); i++) {
                    out.println("   <a href='room?groupId="+groups.get(i).getId()+"' class='list-group-item'>");
                    out.println("       <h4 class='list-group-item-heading'>" + groups.get(i).getName() + "</h4>");
                    out.println("       <p class='list-group-item-text'>...</p>");
                    out.println("    </a>");
                }
 
                if (dao.getAllGroups().isEmpty()) {
                    out.println("   <class='list-group-item'>");
                    out.println("       <h4 class='list-group-item-heading' style='margin-top:20px'>There are no groups available - might wanna create a new group?</h4>");
                    out.println("    </a>");
                } 
                out.println("   </div>");
                out.println(" </div>");
                out.println(" <div role='tabpanel' class='tab-pane' id='profile'>");
 
                ArrayList<Group> mygroups;
 
                String email = (String) request.getSession().getAttribute("email");
 
               mygroups = dao.checkMyGroups(email);
 
                for (int i = 0; i < mygroups.size(); i++) {
                    out.println("   <a href='room?=groupId="+mygroups.get(i).getId()+"' class='list-group-item'>");
                    out.println("       <h4 class='list-group-item-heading'>" + mygroups.get(i).getName() + "</h4>");
                    out.println("       <p class='list-group-item-text'>...</p>");
                    out.println("    </a>");
                }
 
                if (dao.checkMyGroups(email).isEmpty()) {
                    out.println("   <class='list-group-item'>");
                    out.println("       <h4 class='list-group-item-heading'>There are no groups available - try again later</h4>");
                    out.println("    </a>");
                }
 
                out.println("</div>");
                out.println(" <div role='tabpanel' class='tab-pane' id='messages'>"
                        + ""
                        + "<div class=\"col-md-12\" style=\"margin-top:20px;\">\n"
                        + "<form action=\"create\" method=\"GET\">\n"
                        + "                                        <div class=\"form-group\">\n"
                        + "                                            <label for=\"nameInput\">Group name</label>\n"
                        + "                                            <input type=\"text\" class=\"form-control\" id=\"nameInput\" name=\"name\" placeholder=\"Group name\">\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"form-group\">\n"
                        + "                                            <label for=\"passwordInput\">Password</label>\n"
                        + "                                            <input type=\"text\" class=\"form-control\" id=\"passwordInput\" name=\"password\" placeholder=\"Password\">\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"form-group\">\n"
                        + "                                            <label for=\"usertwo\">User 1</label>\n"
                        + "                                            <input type=\"text\" class=\"form-control\" id=\"usertwo\" name=\"userone\" placeholder=\"email\">\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"form-group\">\n"
                        + "                                            <label for=\"userthree\">User 2</label>\n"
                        + "                                            <input type=\"text\" class=\"form-control\" id=\"userthree\" name=\"usertwo\" placeholder=\"email\">\n"
                        + "                                        </div>\n"
                        + "                                        <div class=\"form-group\">\n"
                        + "                                            <label for=\"userfour\">User 3</label>\n"
                        + "                                            <input type=\"text\" class=\"form-control\" id=\"userfour\" name=\"userthree\" placeholder=\"email\">\n"
                        + "                                        </div>\n"
                        + "                                        <button type=\"submit\" class=\"btn btn-success col-md-5\">Create group</button>\n"
                        + "                                    </form>\n"
                        + "                              </div></div>");
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
        ArrayList<Group> groups = new ArrayList<>();
        groups = dao.getAllGroups();
 
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("   <a href='room.html' class='list-group-item'>");
            System.out.println("       <h4 class='list-group-item-heading'>" + groups.get(i).getName() + "");
            System.out.println("       <p class='list-group-item-text'>...</p>");
            System.out.println("    </a>");
            //System.out.println(groups.get(i).getName());
        }
    }
 
    public void myRooms() {
        DAO dao = new DAO();
        dao.checkMyGroups(email);
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
