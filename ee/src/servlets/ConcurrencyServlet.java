package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by echaika on 18.11.2018
 */
@WebServlet(
        name = "ConcurrencyServlet",
        value = {"/concurrent"}
)
public class ConcurrencyServlet extends HttpServlet {

    private int count = 0;

    /**
     * @return Output value has to be 1_000_000
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        URLConnection urlConnection = new URL("http://localhost:8989/ee/concurrent").openConnection();
                        urlConnection.getInputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
