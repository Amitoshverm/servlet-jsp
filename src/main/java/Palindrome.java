import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/palindrome")
public class Palindrome extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String name = request.getParameter("name");

        StringBuffer str = new StringBuffer(name);
        str.reverse();

        if(name.equalsIgnoreCase(str.toString())) {
            out.print("<h1>Is a palindrome</h1>");
        }
        else {
            out.print("<h1>Sorry!! not a palindrome</h1>");
        }
        out.close();
    }
}
