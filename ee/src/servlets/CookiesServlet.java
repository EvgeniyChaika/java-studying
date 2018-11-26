package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echaika on 26.11.2018
 */
@WebServlet("/cookies")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println("Cookie - ");
            System.out.println("name - " + cookie.getName());
            System.out.println("value - " + cookie.getValue());
            System.out.println("comment - " + cookie.getComment());
            System.out.println("domain - " + cookie.getDomain());
            System.out.println("path - " + cookie.getPath());
            System.out.println("maxAge - " + cookie.getMaxAge());
            System.out.println("isSecured - " + cookie.getSecure());
            System.out.println("version - " + cookie.getVersion());
        }
        Cookie testCookie = new Cookie("testCookie", "123456789");
        testCookie.setComment("This is test cookie");
        testCookie.setHttpOnly(true);
        /*
         * will be deleted in 10 seconds
         */
        testCookie.setMaxAge(10);
        testCookie.setVersion(2);
        testCookie.setPath("/ee");
//        testCookie.setSecure(true);
//        testCookie.setDomain("www.foo.com");

        resp.addCookie(testCookie);
    }
}
