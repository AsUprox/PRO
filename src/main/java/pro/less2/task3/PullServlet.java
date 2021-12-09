package pro.less2.task3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "pullServlet", value = "/")
public class PullServlet extends HttpServlet {
    private String q1;
    private String q2;
    private String message;

    public void init() {
        message = "";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        q1 = request.getParameter("question1");
        q2 = request.getParameter("question2");

        message = ("yes".equals(q1) ? "You like Java and " : "You don't like Java and ") +
                  ("yes".equals(q2) ? "you like SQL!" : "you don't like SQL!");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}