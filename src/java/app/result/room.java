/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.result;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "room", urlPatterns
        = {
            "/room"
        })
public class room extends HttpServlet {

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
            out.println("<!DOCTYPE html>\n"
                    + "<!--\n"
                    + "To change this license header, choose License Headers in Project Properties.\n"
                    + "To change this template file, choose Tools | Templates\n"
                    + "and open the template in the editor.\n"
                    + "-->\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>TODO supply a title</title>\n"
                    + "        <meta charset='UTF-8'>\n"
                    + "        <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "        <link rel='stylesheet' type='text/css' href='css/reset.css'>\n"
                    + "        <link rel='stylesheet' type='text/css' href='css/bootstrap-theme.css'>\n"
                    + "        <link rel='stylesheet' type='text/css' href='css/bootstrap.css'>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <div class='container-fluid' style='text-align:center;'>\n"
                    + "            <div class='row'>\n"
                    + "                <nav class='navbar navbar-default'>\n"
                    + "                    <div class='container-fluid'>\n"
                    + "                        <!-- Brand and toggle get grouped for better mobile display -->\n"
                    + "                        <div class='navbar-header'>\n"
                    + "                            <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'>\n"
                    + "                                <span class='sr-only'>Toggle navigation</span>\n"
                    + "                                <span class='icon-bar'></span>\n"
                    + "                                <span class='icon-bar'></span>\n"
                    + "                                <span class='icon-bar'></span>\n"
                    + "                            </button>\n"
                    + "                            <a class='navbar-brand' href='index.html'><img alt=' src='//img//logo.gif' width='50' height='50' style='margin-top: -15px;' ></a>\n"
                    + "                        </div>\n"
                    + "\n"
                    + "                        <!-- Collect the nav links, forms, and other content for toggling -->\n"
                    + "                        <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>\n"
                    + "                            <ul class='nav navbar-nav navbar-right'>\n"
                    + "  <li><a href='logout'>Log out</a></li>"
                    + "                                <li class='dropdown'>\n"
                    + "                                    <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Dropdown <span class='caret'></span></a>\n"
                    + "                                    <ul class='dropdown-menu'>\n"
                    + "                                        <li><a href='#'>Action</a></li>\n"
                    + "                                        <li><a href='#'>Another action</a></li>\n"
                    + "                                        <li><a href='#'>Something else here</a></li>\n"
                    + "                                        <li role='separator' class='divider'></li>\n"
                    + "                                        <li><a href='#'>Separated link</a></li>\n"
                    + "                                    </ul>\n"
                    + "                                </li>\n"
                    + "                            </ul>\n"
                    + "                        </div><!-- /.navbar-collapse -->\n"
                    + "                    </div><!-- /.container-fluid -->\n"
                    + "                </nav>\n"
                    + "            </div>\n"
                    + "            <div class='row' style='margin-top:40px;'>\n"
                    + "\n"
                    + "                <div class='col-md-4'>\n"
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'>\n"
                    + "                    </div>\n"
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'>\n"
                    + "                    </div>\n"
                    + "                    <div class='col-md-12'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "                <div class='col-md-4' style='border: 1px solid #e1e1e1; border-radius:2px;padding-top:20;'>\n"
                    + "                    <div class='col-md-12' style='max-height:500px;overflow:auto;margin:30px 0px;'>\n"
                    + "\n"
                    + "                        <blockquote style='margin-top:20px;text-align:left;'>\n"
                    + "                            <footer>Danny <cite title='Source Title'>- 13:40</cite></footer>\n"
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"
                    + "                        </blockquote>\n"
                    + "                        <blockquote style='margin-top:20px;text-align:left;'>\n"
                    + "                            <footer>Danny <cite title='Source Title'>- 13:40</cite></footer>\n"
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"
                    + "                        </blockquote>\n"
                    + "                        <blockquote class='blockquote-reverse'>\n"
                    + "                            <footer>Xu <cite title='Source Title'>- 13:40</cite></footer>\n"
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"
                    + "                        </blockquote>\n"
                    + "                        <blockquote class='blockquote-reverse'>\n"
                    + "                            <footer>Xu <cite title='Source Title'>- 13:40</cite></footer>\n"
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"
                    + "                        </blockquote>\n"
                    + "                        <blockquote style='text-align:left;'>\n"
                    + "                            <footer>Someone not famous Peter <cite title='Source Title'>- 13:40</cite></footer>\n"
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"
                    + "                        </blockquote></div>\n"
                    + "                    <textarea name='chat' class='form-control' rows='3'></textarea><!-- Indicates a successful or positive action -->\n"
                    + "\n"
                    + "\n"
                    + "                    <button type='button' class='btn btn-success col-md-4 col-md-offset-8' style='margin-top:20px;margin-bottom:20px;'>Send</button>\n"
                    + "                </div>\n"
                    + "                <div class='col-md-4'>\n"
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'>\n"
                    + "                    </div>\n"
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'>\n"
                    + "                    </div>\n"
                    + "                    <div class='col-md-12'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "    </body>\n"
                    + "</html>");
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
