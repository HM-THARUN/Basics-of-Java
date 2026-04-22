package lab6c;




import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        out.println("<html><body>");
        out.println("<h2>Prime Number Result</h2>");

        if (isPrime) {
            out.println("<p>" + num + " is a Prime Number</p>");
        } else {
            out.println("<p>" + num + " is NOT a Prime Number</p>");
        }

        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}