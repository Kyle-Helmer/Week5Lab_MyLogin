package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

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

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    //processes the username and password given by the user
    //redirects the session variable (after the user has successfully logged in)
    //to the home page (/home)
    //Message to user if username or password are invalid 
    //keep text fields filled when redirecting them to login after an unscessful attempt at logging in
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        HttpSession session = request.getSession();
        
        AccountService acct = new AccountService();
        User loggedIn = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username != null || !username.equals("") || password != null || !password.equals("")){
          loggedIn = acct.login(username, password);
          
          if(loggedIn != null){
              session.setAttribute("username", loggedIn.getUsername());
              
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request, response);
          }
        }
        
        
        
    }

}
