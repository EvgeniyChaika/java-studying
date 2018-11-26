package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by echaika on 26.11.2018
 */
@WebServlet("/headers")
public class HeadersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headersNames = req.getHeaderNames();
        while (headersNames.hasMoreElements()) {
            String headerParameter = headersNames.nextElement();
            System.out.println(headerParameter + " = " + req.getHeader(headerParameter));
        }
        System.out.println("-----------------");
        System.out.println(req.getAuthType());
        System.out.println(req.getContentLength());
        System.out.println(req.getContentType());
        System.out.println(req.getMethod());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.getProtocol());
    }
}
