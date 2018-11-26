package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echaika on 26.11.2018
 */
@WebServlet("/statuses")
public class ResponseStatusServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
//        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//        resp.sendRedirect("/ee/gzip");
//        resp.sendError(HttpServletResponse.SC_NOT_FOUND, "custom not found");

//        will refresh page every 1 second
//        resp.setHeader("Refresh", "1");
//        System.out.println("Refreshed");

//        will redirect to https://google.com
        resp.setHeader("Refresh", "5;URL=https://google.com");
        System.out.println("Redirected");
    }
}
