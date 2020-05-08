package Serlvets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Statt World soll ein Name ausgegeben werden,
der zuvor als Parameter des GET-Requests an den Server gesendet wurde.
Geben Sie hier den lauffähigen Quellcode Ihres Servlets DemoServlet2.java ein:

 */
@WebServlet(name = "DemoServlet2")
public class DemoServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();
        String eingabe = request.getQueryString();
        out.println("<html>");

        out.println("<head><titel>HNG</titel></head>");

        out.println("<body>");
        out.println("<h3>Hello " + eingabe + "</h3>");
        out.println("This is my second Servlet");
        out.println("</body>");

        out.println("<html>");
    }
}
