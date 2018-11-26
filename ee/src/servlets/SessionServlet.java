package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by echaika on 26.11.2018
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String element = attributeNames.nextElement();
            System.out.println(element + " = " + session.getAttribute(element));
        }
        session.setAttribute("test", "value");
        System.out.println(session.getAttribute("test"));
        System.out.println(new Date(session.getCreationTime()));
        System.out.println(session.getMaxInactiveInterval());
//        session.setMaxInactiveInterval(10);
    }
}
