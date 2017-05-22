package ua.com.vertex;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    String HTTP_EMAIL_RESPONSE = "<html>\n" +
            "<head>\n" +
            "    <title>Hello Servlet</title>\n" +
            "</head>\n" +
            "<body><h1>Your email was saved: %s</h1></body>\n" +
            "</html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.format(HTTP_EMAIL_RESPONSE, email);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.jsp");
    }
}
