package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by echaika on 14.11.2018
 */
@WebServlet(
        name = "TestServlet",
        value = {"/servlet"},
        description = "Sample example",
        displayName = "Hello World example"
)
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Hello World");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service");
        super.service(req, res);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String name = config.getServletName();
        Enumeration<String> enumeration = config.getInitParameterNames();
        System.out.println("Initialization");
        System.out.println("Initialization - " + name);
        System.out.println("Initialization - " + enumeration.toString());
        System.out.println("Initialization - " + config.getServletContext());
        super.init(config);
    }

    @Override
    public void destroy() {
        System.out.println("Destroying");
        super.destroy();
    }
}
