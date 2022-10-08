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

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        User user = (User) session.getAttribute("user");
        
        //if user wants to logout
        if (logout != null) {
            session.invalidate();
            request.setAttribute("message", "You have logged out. Have a great day!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
        }else if(user != null){ //if a user is already logged in
            response.sendRedirect("home");
        }else{ //everything else
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
        }
        
 
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        AccountService acct = new AccountService();
        User loggedIn = null;
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("username", username);
        request.setAttribute("password", password);
        
        if (username != null || !username.equals("") || password != null || !password.equals("")) {
            loggedIn = acct.login(username, password);

            if (loggedIn != null) {
                session.setAttribute("user", loggedIn);
                response.sendRedirect("home");

            } else {
                request.setAttribute("message", "Invalid Entry, please try again");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                        .forward(request, response);
            }
        }

    }

}
