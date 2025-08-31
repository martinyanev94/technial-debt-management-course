import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FrontControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("login".equals(action)) {
            // Handle login request
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else if ("register".equals(action)) {
            // Handle registration request
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            // Default action
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }
}
