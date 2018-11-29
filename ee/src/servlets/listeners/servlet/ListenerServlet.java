package servlets.listeners.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echaika on 29.11.2018
 */
@WebServlet("/listener")
@WebInitParam(name = "test", value = "test")
public class ListenerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ListenerServlet HttpServletRequest - " + req.toString());
        System.out.println("ContextPath - " + req.getContextPath());
        System.out.println("ServletPath - " + req.getServletPath());
        System.out.println("PathInfo - " + req.getPathInfo());
    }
}
