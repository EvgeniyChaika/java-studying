package servlets.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by echaika on 29.11.2018
 */
@WebListener
public class HttpSessionAttributeListenerImpl implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("HttpSessionAttributeListener attributeAdded(): HttpSessionBindingEvent - " + event.toString());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("HttpSessionAttributeListener attributeRemoved(): HttpSessionBindingEvent - " + event.toString());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("HttpSessionAttributeListener attributeReplaced(): HttpSessionBindingEvent - " + event.toString());
    }
}
