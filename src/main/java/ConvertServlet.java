import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ConvertServlet", urlPatterns = "/convert")
public class ConvertServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double vnd = rate * usd;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<p>Rate: " + rate + "</p>");
        writer.println("<p>USD: " + usd + "</p>");
        writer.println("<p>VND: " + vnd + "</p>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
