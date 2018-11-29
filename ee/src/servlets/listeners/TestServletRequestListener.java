package servlets.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by echaika on 29.11.2018
 */
@WebListener
public class TestServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequestListener requestInitialized(): ServletRequestEvent - " + sre.toString());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletContextListener requestDestroyed(): ServletRequestEvent - " + sre.toString());
    }
}
