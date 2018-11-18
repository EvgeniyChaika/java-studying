package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echaika on 18.11.2018
 */
@WebServlet("/xss")
public class XSSDefenceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one = req.getParameter("one");
        one = one == null ? "" : one.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        resp.getWriter().write(
                "<html><head></head><body>" +
                        "three = " + one +
                        "<form action='xss' method='post'>" +
                        "<textarea name='one'></textarea>" +
                        "<input type='submit' name='submit'/>" +
                        "</form>" +
                        "</body>" +
                        "</html>"
        );
    }

    /**
     * For example insert "<script>alert('XSS!);</script>" to the textarea
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
