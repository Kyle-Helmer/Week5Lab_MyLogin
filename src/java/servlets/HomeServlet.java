
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author Kyle Helmer
 */
public class HomeServlet extends HttpServlet {

    

    //takes the user to (/home) after a successful login
    //Display a message welcoming that user
    //logout link which makes a GET to take the user back to the /login page
    //display you have logged out after
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        request.setAttribute("user", user);
        
        if(user != null){
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }else{
            response.sendRedirect("login");
        }
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

  

}
