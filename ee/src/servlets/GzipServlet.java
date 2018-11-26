package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

/**
 * Created by echaika on 26.11.2018
 */
@WebServlet("/gzip")
public class GzipServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getHeader(HttpHeaders.ACCEPT_ENCODING).contains("gzip")) {
            try (PrintWriter printWriter = new PrintWriter(new GZIPOutputStream(resp.getOutputStream()))) {
                resp.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
                printWriter.write("hello world");
            }
        }
    }
}
