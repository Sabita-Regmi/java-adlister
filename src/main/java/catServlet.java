import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cats")
public class catServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        CatHerder dao=new CatHerder();
        req.setAttribute("cats",dao.getAllCats());
req.getRequestDispatcher("catList.jsp").forward(req,res);
    }
}
