package servlets.listeners;

import servlets.MainServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by echaika on 29.11.2018
 */
@WebListener
public class ServletContextListenerImpl implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.addServlet("/ee/servlet", MainServlet.class);
        System.out.println("ServletContextListener contextInitialized(): ServletContextEvent - " + sce.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener contextDestroyed(): ServletContextEvent - " + sce.toString());
    }
}
