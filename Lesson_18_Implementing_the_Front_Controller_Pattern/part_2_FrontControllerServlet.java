import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrontControllerServlet extends HttpServlet {
    private Map<String, Command> commandMap = new HashMap<>();

    public void init() {
        commandMap.put("login", new LoginCommand());
        commandMap.put("register", new RegisterCommand());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        Command command = commandMap.get(action);

        if (command != null) {
            command.execute(request, response);
        } else {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }
}
