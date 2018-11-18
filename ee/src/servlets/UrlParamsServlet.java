package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by echaika on 18.11.2018
 */
@WebServlet("/params")
public class UrlParamsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] parameterValues = req.getParameterValues("one");
        if (parameterValues != null) {
            System.out.println(Arrays.toString(parameterValues));
            Arrays.stream(parameterValues)
                    .forEach(System.out::println);
        }
        //------------------------------
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String element = parameterNames.nextElement();
            System.out.println("Parameter - " + element + ", value - " + req.getParameter(element));
        }
        //------------------------------
        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + Arrays.toString(v)));
        //------------------------------
        System.out.println(req.getQueryString());
        //------------------------------
        String two = req.getParameter("two");
        String three = req.getParameter("three");
        resp.getWriter().write(
                "<html><head></head><body>" +
                        "two = " + two +
                        " three = " + three +
                        "<form action='params' method='get'>" +
                        "<input type='text' name='two'/>" +
                        "<input type='text' name='three'/>" +
                        "<input type='submit' name='submit'/>" +
                        "</form>" +
                        "</body>" +
                        "</html>"
        );
    }

    public static void main(String[] args) {
        try {
            URLConnection urlConnection =
                    new URL("http://localhost:8989/ee/params?one=first&one=second&two=third&three=fourth")
                            .openConnection();
            urlConnection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
