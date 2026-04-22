package lab6;


	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/FactorialServlet")
	public class FactorialServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        // Set response type
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Get input value
	        int num = Integer.parseInt(request.getParameter("num"));

	        // Calculate factorial
	        long fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }

	        // Display result
	        out.println("<html><body>");
	        out.println("<h2>Factorial Result</h2>");
	        out.println("<p>Factorial of " + num + " is: " + fact + "</p>");
	        out.println("<a href='index.html'>Go Back</a>");
	        out.println("</body></html>");
	    }
	}

