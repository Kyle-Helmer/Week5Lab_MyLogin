
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kyle Helmer
 */
public class LoginServlet extends HttpServlet {

  

    //displays login screen
    //handles the logout request {invalidate, start new session) 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

   //processes the username and password given by the user
    //redirects the session variable (after the user has successfully logged in)
    //to the home page (/home)
    //Message to user if username or password are invalid 
    //keep text fields filled when redirecting them to login after an unscessful attempt at logging in
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
