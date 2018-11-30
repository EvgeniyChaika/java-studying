package servlets.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by echaika on 29.11.2018
 */
@WebListener
public class ServletContextAttributeListenerImpl implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("ServletContextAttributeListener attributeAdded(): ServletContextAttributeEvent - " + event.toString());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("ServletContextAttributeListener attributeRemoved(): ServletContextAttributeEvent - " + event.toString());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("ServletContextAttributeListener attributeReplaced(): ServletContextAttributeEvent - " + event.toString());
    }
}
