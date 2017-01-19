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

@WebServlet(name = "room", urlPatterns =
{
    "/room"
})
public class room extends HttpServlet
{

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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            email = (String) request.getSession().getAttribute("email");

            if (email == null)
            {
                response.sendRedirect("login.html");
            } else{
            out.println("<!DOCTYPE html> "
                    + "<!-- "
                    + "To change this license header, choose License Headers in Project Properties. "
                    + "To change this template file, choose Tools | Templates "
                    + "and open the template in the editor. "
                    + "--> "
                    + "<html> "
                    + "    <head> "
                    + "        <title>TODO supply a title</title> "
                    + "        <meta charset='UTF-8'> "
                    + "        <meta name='viewport' content='width=device-width, initial-scale=1.0'> "
                    + "        <link rel='stylesheet' type='text/css' href='css/reset.css'> "
                    + "        <link rel='stylesheet' type='text/css' href='css/bootstrap-theme.css'> "
                    + "        <link rel='stylesheet' type='text/css' href='css/bootstrap.css'> "
                    + "    </head> "
                    + "    <body> "
                    + "        <div class='container-fluid' style='text-align:center;'> "
                    + "            <div class='row'> "
                    + "                <nav class='navbar navbar-default'> "
                    + "                    <div class='container-fluid'> "
                    + "                        <!-- Brand and toggle get grouped for better mobile display --> "
                    + "                        <div class='navbar-header'> "
                    + "                            <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1' aria-expanded='false'>"
                    + "                                <span class='sr-only'>Toggle navigation</span> "
                    + "                                <span class='icon-bar'></span> "
                    + "                                <span class='icon-bar'></span> "
                    + "                                <span class='icon-bar'></span> "
                    + "                            </button> "
                    + "                            <a class='navbar-brand' href='index.html''><img alt='' src='img/logo.gif' width='50' height='50' style='margin-top: -15px;'' >'" + email + "'</a>"+ "</div> "
                    + " "
                    + "                        <!-- Collect the nav links, forms, and other content for toggling --> "
                    + "                        <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'> "
                    + "                            <ul class='nav navbar-nav navbar-right'> "
                    + "                                <li><a href='#'>Link</a></li> "
                    + "                                <li class='dropdown'> "
                    + "                                    <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Dropdown <span class='caret'></span></a> "
                    + "                                    <ul class='dropdown-menu'> "
                    + "                                        <li><a href='#'>Action</a></li> "
                    + "                                        <li><a href='#'>Another action</a></li> "
                    + "                                        <li><a href='#'>Something else here</a></li> "
                    + "                                        <li role='separator' class='divider'></li> "
                    + "                                        <li><a href='#'>Separated link</a></li> "
                    + "                                    </ul> "
                    + "                                </li> "
                    + "                            </ul> "
                    + "                        </div><!-- /.navbar-collapse --> "
                    + "                    </div><!-- /.container-fluid --> "
                    + "                </nav> "
                    + "            </div> "
                    + "            <div class='row' style='margin-top:40px;'> "
                    + " "
                    + "                <div class='col-md-4'> "
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'> "
                    + "                    </div> "
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'> "
                    + "                    </div> "
                    + "                    <div class='col-md-12'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4 col-md-offset-8'> "
                    + "                    </div> "
                    + "                </div> "
                    + "                <div class='col-md-4' style='border: 1px solid #e1e1e1; border-radius:2px;padding-top:20;'> "
                    + "                    <div class='col-md-12' style='max-height:500px;overflow:auto;margin:30px 0px;'> "
                    + " "
                    + "                        <blockquote style='margin-top:20px;text-align:left;'> "
                    + "                            <footer>Danny <cite title='Source Title'>- 13:40</cite></footer> "
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> "
                    + "                        </blockquote> "
                    + "                        <blockquote style='margin-top:20px;text-align:left;'> "
                    + "                            <footer>Danny <cite title='Source Title'>- 13:40</cite></footer> "
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> "
                    + "                        </blockquote> "
                    + "                        <blockquote class='blockquote-reverse'> "
                    + "                            <footer>Xu <cite title='Source Title'>- 13:40</cite></footer> "
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> "
                    + "                        </blockquote> "
                    + "                        <blockquote class='blockquote-reverse'> "
                    + "                            <footer>Xu <cite title='Source Title'>- 13:40</cite></footer> "
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> "
                    + "                        </blockquote> "
                    + "                        <blockquote style='text-align:left;'> "
                    + "                            <footer>Someone not famous Peter <cite title='Source Title'>- 13:40</cite></footer> "
                    + "                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> "
                    + "                        </blockquote></div> "
                    + "                    <textarea name='chat' class='form-control' rows='3'></textarea><!-- Indicates a successful or positive action --> "
                    + " "
                    + " "
                    + "                    <button type='button' class='btn btn-success col-md-4 col-md-offset-8' style='margin-top:20px;margin-bottom:20px;'>Send</button> "
                    + "                </div> "
                    + "                <div class='col-md-4'> "
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'> "
                    + "                    </div> "
                    + "                    <div class='col-md-12' style='margin-bottom:20px;'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'> "
                    + "                    </div> "
                    + "                    <div class='col-md-12'><img src='http://placehold.it/150x150' alt='...' class='img-thumbnail col-md-4'> "
                    + "                    </div> "
                    + "                </div> "
                    + "            </div> "
                    + "        </div> "
                    + "    </body> "
                    + "</html>");
        }
    }}

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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}