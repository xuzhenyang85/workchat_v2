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

@WebServlet(urlPatterns =
{
    "/workchat"
})
public class workchat extends HttpServlet
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String password;
        String name;
        String email;

        DAO dao = new DAO();

        try
        {
            password = request.getParameter("password");

            name = request.getParameter("name");

            email = request.getParameter("email");

            if (name.isEmpty() || email.isEmpty())
            {
                response.sendRedirect("error.html");
            }
            if (dao.isAlreadyUser(name, email))
            {
                response.sendRedirect("error.html");
            } else
            {
                dao.createUser(name, password, email);
                HttpSession session = request.getSession(true);
                session.setAttribute("email", email);
                response.sendRedirect("dashboard");
            }
        } catch (NumberFormatException ex)
        {
            password = null;
            name = null;
            email = null;
        }

    }

    private void errorMessage(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.sendRedirect("error.html");
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
