import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/ads")

public class AdServlet  extends HttpServlet {
    Ads dao = DaoFactory.getAdsDao();
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        List<Ad> adds = dao.all();

        req.setAttribute("adds",adds);

        req.getRequestDispatcher("/ads/index.jsp").forward(req, res);
    }

}
