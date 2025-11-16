import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/even-range-servlet")
public class EvenRangeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int start = Integer.parseInt(req.getParameter("start"));
        int end = Integer.parseInt(req.getParameter("end"));

        for(int i = start; i <= end; i++) {
            if(i % 2 == 0) {
                out.print("<p>"+ i +"</p>");
            }
        }
        out.print("<html>");
        out.close();

    }
}
