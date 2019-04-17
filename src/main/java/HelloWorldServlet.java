import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")

public class HelloWorldServlet extends HttpServlet {
    int counter=0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(" yay this works");
counter++;
        String name = request.getParameter("name");
        if(name==null)name="world";
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1><em>Hello hi," + name + "</em></h1>");
//
request.setAttribute("name",name);
request.setAttribute("count",counter);
request.getRequestDispatcher("Hello.jsp").forward(request,response);

    }
}