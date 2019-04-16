import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



@WebServlet(name = "HitCountServlet", urlPatterns = "/count")
public class HitCountServlet extends HttpServlet {



        int hitCount=0;
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



            hitCount++;
            String x = request.getParameter("x");   //get the parameter as String
            int x1 = Integer.parseInt(x); //set the parameter here
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String title = "Total Number of Hits";
            out.println("<h1>"+title+" "+x+"</h1>");


        }


    }


