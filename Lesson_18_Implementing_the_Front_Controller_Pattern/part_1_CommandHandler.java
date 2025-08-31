public interface Command {
    void execute(HttpServletRequest request, HttpServletResponse response);
}
public class LoginCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Handle login logic
        // Example: Validate user, set session attributes, etc.
        request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
    }
}

public class RegisterCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Handle registration logic
        request.getRequestDispatcher("registerSuccess.jsp").forward(request, response);
    }
}
