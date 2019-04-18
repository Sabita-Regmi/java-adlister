
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        if (req.getSession().getAttribute("user") != null) {
            res.sendRedirect("/profile");

        } else {
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, res);
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            if (username.equals("admin") && password.equals("password")) {
                HttpSession session = req.getSession();
                session.setAttribute("user", username);
                res.sendRedirect("/profile");
            } else {
                res.sendRedirect("/login");
            }
        }
    }
}
