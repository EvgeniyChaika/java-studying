package servlets.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
import java.util.Date;

/**
 * Created by echaika on 29.11.2018
 */
@WebFilter(filterName = "MainFilter", urlPatterns = {"/*"},
initParams = {
        @WebInitParam(name = "test", value = "test")
})
public class MainFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute(HttpHeaders.DATE, new Date());
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
        System.out.println("Filter ServletRequest - " + request.toString());
        System.out.println("Filter ServletResponse - " + response.toString());
        System.out.println("Filter FilterChain - " + chain.toString());
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy");
    }
}
