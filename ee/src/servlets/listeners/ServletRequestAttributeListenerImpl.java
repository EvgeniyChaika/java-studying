package servlets.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by echaika on 29.11.2018
 */
@WebListener
public class ServletRequestAttributeListenerImpl implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeAdded(): ServletRequestAttributeEvent - " + srae.toString());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeRemoved(): ServletRequestAttributeEvent - " + srae.toString());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("ServletRequestAttributeListener attributeReplaced(): ServletRequestAttributeEvent - " + srae.toString());
    }
}
